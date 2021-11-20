/*
 * Copyright (C) 2012-2014 Neo Visionaries Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ee.studiofrancium.common.i18n

import ee.studiofrancium.common.i18n.LanguageAlpha3Code.Companion.getByCode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LanguageAlpha3CodeTest {
    @Test
    fun test1() {
        assertNull(getByCode(null))
    }

    @Test
    fun test2() {
        assertNull(getByCode(""))
    }

    @Test
    fun test3() {
        assertNull(getByCode("?"))
    }

    @Test
    fun test4() {
        assertNull(getByCode("??"))
    }

    @Test
    fun test5() {
        assertNull(getByCode("???"))
    }

    @Test
    fun test6() {
        assertNull(getByCode("????"))
    }

    @Test
    fun test7() {
        assertSame(LanguageAlpha3Code.jpn, getByCode("jpn"))
    }

    @Test
    fun test8() {
        assertNull(getByCode("JPN"))
    }

    @Test
    fun test9() {
        assertSame(LanguageAlpha3Code.jpn, getByCode("jpn", true))
    }

    @Test
    fun test10() {
        assertNull(getByCode("JPN", true))
    }

    @Test
    fun test11() {
        assertSame(LanguageAlpha3Code.jpn, getByCode("jpn", false))
    }

    @Test
    fun test12() {
        assertSame(LanguageAlpha3Code.jpn, getByCode("JPN", false))
    }

    @Test
    fun test13() {
        assertSame(LanguageAlpha3Code.heb, getByCode("he"))
    }

    @Test
    fun test14() {
        assertSame(LanguageAlpha3Code.heb, getByCode("iw"))
    }

    @Test
    fun test15() {
        assertSame(LanguageAlpha3Code.yid, getByCode("yi"))
    }

    @Test
    fun test16() {
        assertSame(LanguageAlpha3Code.yid, getByCode("ji"))
    }

    @Test
    fun test17() {
        assertSame(LanguageAlpha3Code.ind, getByCode("id"))
    }

    @Test
    fun test18() {
        assertSame(LanguageAlpha3Code.ind, getByCode("in"))
    }

    @Test
    fun test19() {
        assertSame(LanguageAlpha3Code.tib, LanguageAlpha3Code.bod.getSynonym())
    }

    @Test
    fun test20() {
        assertSame(LanguageAlpha3Code.bod, LanguageAlpha3Code.bod.getAlpha3T())
    }

    @Test
    fun test21() {
        assertSame(LanguageAlpha3Code.tib, LanguageAlpha3Code.bod.getAlpha3B())
    }

    @Test
    fun test22() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.bod.getUsage())
    }

    @Test
    fun test23() {
        assertSame(LanguageAlpha3Code.bod, LanguageAlpha3Code.tib.getSynonym())
    }

    @Test
    fun test24() {
        assertSame(LanguageAlpha3Code.bod, LanguageAlpha3Code.tib.getAlpha3T())
    }

    @Test
    fun test25() {
        assertSame(LanguageAlpha3Code.tib, LanguageAlpha3Code.tib.getAlpha3B())
    }

    @Test
    fun test26() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.tib.getUsage())
    }

    @Test
    fun test27() {
        assertSame(LanguageAlpha3Code.baq, LanguageAlpha3Code.eus.getSynonym())
    }

    @Test
    fun test28() {
        assertSame(LanguageAlpha3Code.eus, LanguageAlpha3Code.eus.getAlpha3T())
    }

    @Test
    fun test29() {
        assertSame(LanguageAlpha3Code.baq, LanguageAlpha3Code.eus.getAlpha3B())
    }

    @Test
    fun test30() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.eus.getUsage())
    }

    @Test
    fun test31() {
        assertSame(LanguageAlpha3Code.eus, LanguageAlpha3Code.baq.getSynonym())
    }

    @Test
    fun test32() {
        assertSame(LanguageAlpha3Code.eus, LanguageAlpha3Code.baq.getAlpha3T())
    }

    @Test
    fun test33() {
        assertSame(LanguageAlpha3Code.baq, LanguageAlpha3Code.baq.getAlpha3B())
    }

    @Test
    fun test34() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.baq.getUsage())
    }

    @Test
    fun test35() {
        assertSame(LanguageAlpha3Code.cze, LanguageAlpha3Code.ces.getSynonym())
    }

    @Test
    fun test36() {
        assertSame(LanguageAlpha3Code.ces, LanguageAlpha3Code.ces.getAlpha3T())
    }

    @Test
    fun test37() {
        assertSame(LanguageAlpha3Code.cze, LanguageAlpha3Code.ces.getAlpha3B())
    }

    @Test
    fun test38() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.ces.getUsage())
    }

    @Test
    fun test39() {
        assertSame(LanguageAlpha3Code.ces, LanguageAlpha3Code.cze.getSynonym())
    }

    @Test
    fun test40() {
        assertSame(LanguageAlpha3Code.ces, LanguageAlpha3Code.cze.getAlpha3T())
    }

    @Test
    fun test41() {
        assertSame(LanguageAlpha3Code.cze, LanguageAlpha3Code.cze.getAlpha3B())
    }

    @Test
    fun test42() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.cze.getUsage())
    }

    @Test
    fun test43() {
        assertSame(LanguageAlpha3Code.wel, LanguageAlpha3Code.cym.getSynonym())
    }

    @Test
    fun test44() {
        assertSame(LanguageAlpha3Code.cym, LanguageAlpha3Code.cym.getAlpha3T())
    }

    @Test
    fun test45() {
        assertSame(LanguageAlpha3Code.wel, LanguageAlpha3Code.cym.getAlpha3B())
    }

    @Test
    fun test46() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.cym.getUsage())
    }

    @Test
    fun test47() {
        assertSame(LanguageAlpha3Code.cym, LanguageAlpha3Code.wel.getSynonym())
    }

    @Test
    fun test48() {
        assertSame(LanguageAlpha3Code.cym, LanguageAlpha3Code.wel.getAlpha3T())
    }

    @Test
    fun test49() {
        assertSame(LanguageAlpha3Code.wel, LanguageAlpha3Code.wel.getAlpha3B())
    }

    @Test
    fun test50() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.wel.getUsage())
    }

    @Test
    fun test51() {
        assertSame(LanguageAlpha3Code.ger, LanguageAlpha3Code.deu.getSynonym())
    }

    @Test
    fun test52() {
        assertSame(LanguageAlpha3Code.deu, LanguageAlpha3Code.deu.getAlpha3T())
    }

    @Test
    fun test53() {
        assertSame(LanguageAlpha3Code.ger, LanguageAlpha3Code.deu.getAlpha3B())
    }

    @Test
    fun test54() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.deu.getUsage())
    }

    @Test
    fun test55() {
        assertSame(LanguageAlpha3Code.deu, LanguageAlpha3Code.ger.getSynonym())
    }

    @Test
    fun test56() {
        assertSame(LanguageAlpha3Code.deu, LanguageAlpha3Code.ger.getAlpha3T())
    }

    @Test
    fun test57() {
        assertSame(LanguageAlpha3Code.ger, LanguageAlpha3Code.ger.getAlpha3B())
    }

    @Test
    fun test58() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.ger.getUsage())
    }

    @Test
    fun test59() {
        assertSame(LanguageAlpha3Code.gre, LanguageAlpha3Code.ell.getSynonym())
    }

    @Test
    fun test60() {
        assertSame(LanguageAlpha3Code.ell, LanguageAlpha3Code.ell.getAlpha3T())
    }

    @Test
    fun test61() {
        assertSame(LanguageAlpha3Code.gre, LanguageAlpha3Code.ell.getAlpha3B())
    }

    @Test
    fun test62() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.ell.getUsage())
    }

    @Test
    fun test63() {
        assertSame(LanguageAlpha3Code.ell, LanguageAlpha3Code.gre.getSynonym())
    }

    @Test
    fun test64() {
        assertSame(LanguageAlpha3Code.ell, LanguageAlpha3Code.gre.getAlpha3T())
    }

    @Test
    fun test65() {
        assertSame(LanguageAlpha3Code.gre, LanguageAlpha3Code.gre.getAlpha3B())
    }

    @Test
    fun test66() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.gre.getUsage())
    }

    @Test
    fun test67() {
        assertSame(LanguageAlpha3Code.per, LanguageAlpha3Code.fas.getSynonym())
    }

    @Test
    fun test68() {
        assertSame(LanguageAlpha3Code.fas, LanguageAlpha3Code.fas.getAlpha3T())
    }

    @Test
    fun test69() {
        assertSame(LanguageAlpha3Code.per, LanguageAlpha3Code.fas.getAlpha3B())
    }

    @Test
    fun test70() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.fas.getUsage())
    }

    @Test
    fun test71() {
        assertSame(LanguageAlpha3Code.fas, LanguageAlpha3Code.per.getSynonym())
    }

    @Test
    fun test72() {
        assertSame(LanguageAlpha3Code.fas, LanguageAlpha3Code.per.getAlpha3T())
    }

    @Test
    fun test73() {
        assertSame(LanguageAlpha3Code.per, LanguageAlpha3Code.per.getAlpha3B())
    }

    @Test
    fun test74() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.per.getUsage())
    }

    @Test
    fun test75() {
        assertSame(LanguageAlpha3Code.fre, LanguageAlpha3Code.fra.getSynonym())
    }

    @Test
    fun test76() {
        assertSame(LanguageAlpha3Code.fra, LanguageAlpha3Code.fra.getAlpha3T())
    }

    @Test
    fun test77() {
        assertSame(LanguageAlpha3Code.fre, LanguageAlpha3Code.fra.getAlpha3B())
    }

    @Test
    fun test78() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.fra.getUsage())
    }

    @Test
    fun test79() {
        assertSame(LanguageAlpha3Code.fra, LanguageAlpha3Code.fre.getSynonym())
    }

    @Test
    fun test80() {
        assertSame(LanguageAlpha3Code.fra, LanguageAlpha3Code.fre.getAlpha3T())
    }

    @Test
    fun test81() {
        assertSame(LanguageAlpha3Code.fre, LanguageAlpha3Code.fre.getAlpha3B())
    }

    @Test
    fun test82() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.fre.getUsage())
    }

    @Test
    fun test83() {
        assertSame(LanguageAlpha3Code.arm, LanguageAlpha3Code.hye.getSynonym())
    }

    @Test
    fun test84() {
        assertSame(LanguageAlpha3Code.hye, LanguageAlpha3Code.hye.getAlpha3T())
    }

    @Test
    fun test85() {
        assertSame(LanguageAlpha3Code.arm, LanguageAlpha3Code.hye.getAlpha3B())
    }

    @Test
    fun test86() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.hye.getUsage())
    }

    @Test
    fun test87() {
        assertSame(LanguageAlpha3Code.hye, LanguageAlpha3Code.arm.getSynonym())
    }

    @Test
    fun test88() {
        assertSame(LanguageAlpha3Code.hye, LanguageAlpha3Code.arm.getAlpha3T())
    }

    @Test
    fun test89() {
        assertSame(LanguageAlpha3Code.arm, LanguageAlpha3Code.arm.getAlpha3B())
    }

    @Test
    fun test90() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.arm.getUsage())
    }

    @Test
    fun test91() {
        assertSame(LanguageAlpha3Code.ice, LanguageAlpha3Code.isl.getSynonym())
    }

    @Test
    fun test92() {
        assertSame(LanguageAlpha3Code.isl, LanguageAlpha3Code.isl.getAlpha3T())
    }

    @Test
    fun test93() {
        assertSame(LanguageAlpha3Code.ice, LanguageAlpha3Code.isl.getAlpha3B())
    }

    @Test
    fun test94() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.isl.getUsage())
    }

    @Test
    fun test95() {
        assertSame(LanguageAlpha3Code.isl, LanguageAlpha3Code.ice.getSynonym())
    }

    @Test
    fun test96() {
        assertSame(LanguageAlpha3Code.isl, LanguageAlpha3Code.ice.getAlpha3T())
    }

    @Test
    fun test97() {
        assertSame(LanguageAlpha3Code.ice, LanguageAlpha3Code.ice.getAlpha3B())
    }

    @Test
    fun test98() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.ice.getUsage())
    }

    @Test
    fun test99() {
        assertSame(LanguageAlpha3Code.geo, LanguageAlpha3Code.kat.getSynonym())
    }

    @Test
    fun test100() {
        assertSame(LanguageAlpha3Code.kat, LanguageAlpha3Code.kat.getAlpha3T())
    }

    @Test
    fun test101() {
        assertSame(LanguageAlpha3Code.geo, LanguageAlpha3Code.kat.getAlpha3B())
    }

    @Test
    fun test102() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.kat.getUsage())
    }

    @Test
    fun test103() {
        assertSame(LanguageAlpha3Code.kat, LanguageAlpha3Code.geo.getSynonym())
    }

    @Test
    fun test104() {
        assertSame(LanguageAlpha3Code.kat, LanguageAlpha3Code.geo.getAlpha3T())
    }

    @Test
    fun test105() {
        assertSame(LanguageAlpha3Code.geo, LanguageAlpha3Code.geo.getAlpha3B())
    }

    @Test
    fun test106() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.geo.getUsage())
    }

    @Test
    fun test107() {
        assertSame(LanguageAlpha3Code.mao, LanguageAlpha3Code.mri.getSynonym())
    }

    @Test
    fun test108() {
        assertSame(LanguageAlpha3Code.mri, LanguageAlpha3Code.mri.getAlpha3T())
    }

    @Test
    fun test109() {
        assertSame(LanguageAlpha3Code.mao, LanguageAlpha3Code.mri.getAlpha3B())
    }

    @Test
    fun test110() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.mri.getUsage())
    }

    @Test
    fun test111() {
        assertSame(LanguageAlpha3Code.mri, LanguageAlpha3Code.mao.getSynonym())
    }

    @Test
    fun test112() {
        assertSame(LanguageAlpha3Code.mri, LanguageAlpha3Code.mao.getAlpha3T())
    }

    @Test
    fun test113() {
        assertSame(LanguageAlpha3Code.mao, LanguageAlpha3Code.mao.getAlpha3B())
    }

    @Test
    fun test114() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.mao.getUsage())
    }

    @Test
    fun test115() {
        assertSame(LanguageAlpha3Code.mac, LanguageAlpha3Code.mkd.getSynonym())
    }

    @Test
    fun test116() {
        assertSame(LanguageAlpha3Code.mkd, LanguageAlpha3Code.mkd.getAlpha3T())
    }

    @Test
    fun test117() {
        assertSame(LanguageAlpha3Code.mac, LanguageAlpha3Code.mkd.getAlpha3B())
    }

    @Test
    fun test118() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.mkd.getUsage())
    }

    @Test
    fun test119() {
        assertSame(LanguageAlpha3Code.mkd, LanguageAlpha3Code.mac.getSynonym())
    }

    @Test
    fun test120() {
        assertSame(LanguageAlpha3Code.mkd, LanguageAlpha3Code.mac.getAlpha3T())
    }

    @Test
    fun test121() {
        assertSame(LanguageAlpha3Code.mac, LanguageAlpha3Code.mac.getAlpha3B())
    }

    @Test
    fun test122() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.mac.getUsage())
    }

    @Test
    fun test123() {
        assertSame(LanguageAlpha3Code.may, LanguageAlpha3Code.msa.getSynonym())
    }

    @Test
    fun test124() {
        assertSame(LanguageAlpha3Code.msa, LanguageAlpha3Code.msa.getAlpha3T())
    }

    @Test
    fun test125() {
        assertSame(LanguageAlpha3Code.may, LanguageAlpha3Code.msa.getAlpha3B())
    }

    @Test
    fun test126() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.msa.getUsage())
    }

    @Test
    fun test127() {
        assertSame(LanguageAlpha3Code.msa, LanguageAlpha3Code.may.getSynonym())
    }

    @Test
    fun test128() {
        assertSame(LanguageAlpha3Code.msa, LanguageAlpha3Code.may.getAlpha3T())
    }

    @Test
    fun test129() {
        assertSame(LanguageAlpha3Code.may, LanguageAlpha3Code.may.getAlpha3B())
    }

    @Test
    fun test130() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.may.getUsage())
    }

    @Test
    fun test131() {
        assertSame(LanguageAlpha3Code.bur, LanguageAlpha3Code.mya.getSynonym())
    }

    @Test
    fun test132() {
        assertSame(LanguageAlpha3Code.mya, LanguageAlpha3Code.mya.getAlpha3T())
    }

    @Test
    fun test133() {
        assertSame(LanguageAlpha3Code.bur, LanguageAlpha3Code.mya.getAlpha3B())
    }

    @Test
    fun test134() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.mya.getUsage())
    }

    @Test
    fun test135() {
        assertSame(LanguageAlpha3Code.mya, LanguageAlpha3Code.bur.getSynonym())
    }

    @Test
    fun test136() {
        assertSame(LanguageAlpha3Code.mya, LanguageAlpha3Code.bur.getAlpha3T())
    }

    @Test
    fun test137() {
        assertSame(LanguageAlpha3Code.bur, LanguageAlpha3Code.bur.getAlpha3B())
    }

    @Test
    fun test138() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.bur.getUsage())
    }

    @Test
    fun test139() {
        assertSame(LanguageAlpha3Code.dut, LanguageAlpha3Code.nld.getSynonym())
    }

    @Test
    fun test140() {
        assertSame(LanguageAlpha3Code.nld, LanguageAlpha3Code.nld.getAlpha3T())
    }

    @Test
    fun test141() {
        assertSame(LanguageAlpha3Code.dut, LanguageAlpha3Code.nld.getAlpha3B())
    }

    @Test
    fun test142() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.nld.getUsage())
    }

    @Test
    fun test143() {
        assertSame(LanguageAlpha3Code.nld, LanguageAlpha3Code.dut.getSynonym())
    }

    @Test
    fun test144() {
        assertSame(LanguageAlpha3Code.nld, LanguageAlpha3Code.dut.getAlpha3T())
    }

    @Test
    fun test145() {
        assertSame(LanguageAlpha3Code.dut, LanguageAlpha3Code.dut.getAlpha3B())
    }

    @Test
    fun test146() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.dut.getUsage())
    }

    @Test
    fun test147() {
        assertSame(LanguageAlpha3Code.rum, LanguageAlpha3Code.ron.getSynonym())
    }

    @Test
    fun test148() {
        assertSame(LanguageAlpha3Code.ron, LanguageAlpha3Code.ron.getAlpha3T())
    }

    @Test
    fun test149() {
        assertSame(LanguageAlpha3Code.rum, LanguageAlpha3Code.ron.getAlpha3B())
    }

    @Test
    fun test150() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.ron.getUsage())
    }

    @Test
    fun test151() {
        assertSame(LanguageAlpha3Code.ron, LanguageAlpha3Code.rum.getSynonym())
    }

    @Test
    fun test152() {
        assertSame(LanguageAlpha3Code.ron, LanguageAlpha3Code.rum.getAlpha3T())
    }

    @Test
    fun test153() {
        assertSame(LanguageAlpha3Code.rum, LanguageAlpha3Code.rum.getAlpha3B())
    }

    @Test
    fun test154() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.rum.getUsage())
    }

    @Test
    fun test155() {
        assertSame(LanguageAlpha3Code.slo, LanguageAlpha3Code.slk.getSynonym())
    }

    @Test
    fun test156() {
        assertSame(LanguageAlpha3Code.slk, LanguageAlpha3Code.slk.getAlpha3T())
    }

    @Test
    fun test157() {
        assertSame(LanguageAlpha3Code.slo, LanguageAlpha3Code.slk.getAlpha3B())
    }

    @Test
    fun test158() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.slk.getUsage())
    }

    @Test
    fun test159() {
        assertSame(LanguageAlpha3Code.slk, LanguageAlpha3Code.slo.getSynonym())
    }

    @Test
    fun test160() {
        assertSame(LanguageAlpha3Code.slk, LanguageAlpha3Code.slo.getAlpha3T())
    }

    @Test
    fun test161() {
        assertSame(LanguageAlpha3Code.slo, LanguageAlpha3Code.slo.getAlpha3B())
    }

    @Test
    fun test162() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.slo.getUsage())
    }

    @Test
    fun test163() {
        assertSame(LanguageAlpha3Code.alb, LanguageAlpha3Code.sqi.getSynonym())
    }

    @Test
    fun test164() {
        assertSame(LanguageAlpha3Code.sqi, LanguageAlpha3Code.sqi.getAlpha3T())
    }

    @Test
    fun test165() {
        assertSame(LanguageAlpha3Code.alb, LanguageAlpha3Code.sqi.getAlpha3B())
    }

    @Test
    fun test166() {
        assertSame(LanguageAlpha3Code.Usage.TERMINOLOGY, LanguageAlpha3Code.sqi.getUsage())
    }

    @Test
    fun test167() {
        assertSame(LanguageAlpha3Code.sqi, LanguageAlpha3Code.alb.getSynonym())
    }

    @Test
    fun test168() {
        assertSame(LanguageAlpha3Code.sqi, LanguageAlpha3Code.alb.getAlpha3T())
    }

    @Test
    fun test169() {
        assertSame(LanguageAlpha3Code.alb, LanguageAlpha3Code.alb.getAlpha3B())
    }

    @Test
    fun test170() {
        assertSame(LanguageAlpha3Code.Usage.BIBLIOGRAPHY, LanguageAlpha3Code.alb.getUsage())
    }

    @Test
    fun test171() {
        assertSame(LanguageAlpha3Code.jpn, LanguageAlpha3Code.jpn.getSynonym())
    }

    @Test
    fun test172() {
        assertSame(LanguageAlpha3Code.jpn, LanguageAlpha3Code.jpn.getAlpha3T())
    }

    @Test
    fun test173() {
        assertSame(LanguageAlpha3Code.jpn, LanguageAlpha3Code.jpn.getAlpha3B())
    }

    @Test
    fun test174() {
        assertSame(LanguageAlpha3Code.Usage.COMMON, LanguageAlpha3Code.jpn.getUsage())
    }

    @Test
    fun test175() {
        assertSame("Japanese", LanguageAlpha3Code.jpn.value)
    }

    @Test
    fun test176() {
        assertSame(LanguageAlpha3Code.New, getByCode("New", true))
    }

    @Test
    fun test177() {
        assertSame(LanguageAlpha3Code.New, getByCode("new", true))
    }

    @Test
    fun test178() {
        assertNull(getByCode("NEW", true))
    }

    @Test
    fun test179() {
        assertEquals("new", LanguageAlpha3Code.New.toString())
    }

    @Test
    fun test180() {
        val list: List<LanguageAlpha3Code> = LanguageAlpha3Code.findByName("Old.*")
        assertEquals(7, list.size)

        // ang : Old English
        assertTrue(list.contains(LanguageAlpha3Code.ang))

        // fro : Old French
        assertTrue(list.contains(LanguageAlpha3Code.fro))

        // goh : Old High German
        assertTrue(list.contains(LanguageAlpha3Code.goh))

        // non : Old Norse
        assertTrue(list.contains(LanguageAlpha3Code.non))

        // peo : Old Persian
        assertTrue(list.contains(LanguageAlpha3Code.peo))

        // pro : Old Provencal
        assertTrue(list.contains(LanguageAlpha3Code.pro))

        // sga : Old Irish
        assertTrue(list.contains(LanguageAlpha3Code.fro))
    }

    @Test
    fun test181() {
        assertSame(LanguageAlpha3Code.undefined, getByCode("undefined"))
    }

    @Test
    fun test182() {
        assertNull(getByCode("UNDEFINED"))
    }

    @Test
    fun test183() {
        assertSame(LanguageAlpha3Code.undefined, getByCode("UNDEFINED", false))
    }
}
