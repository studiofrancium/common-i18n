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

import ee.studiofrancium.common.i18n.LanguageCode.Companion.getByCode
import ee.studiofrancium.common.i18n.LanguageCode.Companion.getByLocale
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*

internal class LanguageCodeTest {
    @Test
    fun test1() {
        assertSame(LanguageCode.ja, getByCode("ja"))
    }

    @Test
    fun test2() {
        assertNull(getByCode("JA"))
    }

    @Test
    fun test3() {
        assertSame(LanguageCode.ja, getByCode("ja", true))
    }

    @Test
    fun test4() {
        assertNull(getByCode("JA", true))
    }

    @Test
    fun test5() {
        assertSame(LanguageCode.ja, getByCode("ja", false))
    }

    @Test
    fun test6() {
        assertSame(LanguageCode.ja, getByCode("JA", false))
    }

    @Test
    fun test7() {
        assertNull(getByCode(null))
    }

    @Test
    fun test8() {
        assertNull(getByCode(""))
    }

    @Test
    fun test9() {
        assertNull(getByCode("?"))
    }

    @Test
    fun test10() {
        assertNull(getByCode("??"))
    }

    @Test
    fun test11() {
        assertNull(getByCode("???"))
    }

    @Test
    fun test12() {
        assertNull(getByCode("????"))
    }

    @Test
    fun test13() {
        assertSame(LanguageCode.he, getByCode("he"))
    }

    @Test
    fun test14() {
        assertSame(LanguageCode.he, getByCode("iw"))
    }

    @Test
    fun test15() {
        assertSame(LanguageCode.yi, getByCode("yi"))
    }

    @Test
    fun test16() {
        assertSame(LanguageCode.yi, getByCode("ji"))
    }

    @Test
    fun test17() {
        assertSame(LanguageCode.id, getByCode("id"))
    }

    @Test
    fun test18() {
        assertSame(LanguageCode.id, getByCode("in"))
    }

    @Test
    fun test19() {
        assertSame(Locale.GERMAN, LanguageCode.de.toLocale())
    }

    @Test
    fun test20() {
        assertSame(Locale.ENGLISH, LanguageCode.en.toLocale())
    }

    @Test
    fun test21() {
        assertSame(Locale.FRENCH, LanguageCode.fr.toLocale())
    }

    @Test
    fun test22() {
        assertSame(Locale.ITALIAN, LanguageCode.it.toLocale())
    }

    @Test
    fun test23() {
        assertSame(Locale.JAPANESE, LanguageCode.ja.toLocale())
    }

    @Test
    fun test24() {
        assertSame(Locale.KOREAN, LanguageCode.ko.toLocale())
    }

    @Test
    fun test25() {
        assertSame(Locale.CHINESE, LanguageCode.zh.toLocale())
    }

    @Test
    fun test26() {
        assertNull(getByLocale(null))
    }

    @Test
    fun test27() {
        assertSame(LanguageCode.undefined, getByLocale(Locale("")))
    }

    @Test
    fun test28() {
        assertSame(LanguageCode.fr, getByLocale(Locale.CANADA_FRENCH))
    }

    @Test
    fun test29() {
        assertSame(LanguageCode.zh, getByLocale(Locale.CHINESE))
    }

    @Test
    fun test30() {
        assertSame(LanguageCode.en, getByLocale(Locale.ENGLISH))
    }

    @Test
    fun test31() {
        assertSame(LanguageCode.fr, getByLocale(Locale.FRENCH))
    }

    @Test
    fun test32() {
        assertSame(LanguageCode.de, getByLocale(Locale.GERMAN))
    }

    @Test
    fun test33() {
        assertSame(LanguageCode.it, getByLocale(Locale.ITALIAN))
    }

    @Test
    fun test34() {
        assertSame(LanguageCode.ja, getByLocale(Locale.JAPANESE))
    }

    @Test
    fun test35() {
        assertSame(LanguageCode.ko, getByLocale(Locale.KOREAN))
    }

    @Test
    fun test36() {
        assertSame(LanguageCode.zh, getByLocale(Locale.SIMPLIFIED_CHINESE))
    }

    @Test
    fun test37() {
        assertSame(LanguageCode.zh, getByLocale(Locale.TRADITIONAL_CHINESE))
    }

    @Test
    fun test38() {
        assertSame(LanguageCode.ja, getByLocale(Locale("ja")))
    }

    @Test
    fun test39() {
        assertSame(LanguageCode.ja, getByLocale(Locale("ja", "JP")))
    }

    @Test
    fun test40() {
        assertSame(LanguageCode.bo, getByCode("bo"))
    }

    @Test
    fun test41() {
        assertSame(LanguageCode.bo, getByCode("bod"))
    }

    @Test
    fun test42() {
        assertSame(LanguageCode.bo, getByCode("tib"))
    }

    @Test
    fun test43() {
        assertSame(LanguageCode.eu, getByCode("eu"))
    }

    @Test
    fun test44() {
        assertSame(LanguageCode.eu, getByCode("eus"))
    }

    @Test
    fun test45() {
        assertSame(LanguageCode.eu, getByCode("baq"))
    }

    @Test
    fun test46() {
        assertSame(LanguageCode.cs, getByCode("cs"))
    }

    @Test
    fun test47() {
        assertSame(LanguageCode.cs, getByCode("ces"))
    }

    @Test
    fun test48() {
        assertSame(LanguageCode.cs, getByCode("cze"))
    }

    @Test
    fun test49() {
        assertSame(LanguageCode.cy, getByCode("cy"))
    }

    @Test
    fun test50() {
        assertSame(LanguageCode.cy, getByCode("cym"))
    }

    @Test
    fun test51() {
        assertSame(LanguageCode.cy, getByCode("wel"))
    }

    @Test
    fun test52() {
        assertSame(LanguageCode.de, getByCode("de"))
    }

    @Test
    fun test53() {
        assertSame(LanguageCode.de, getByCode("deu"))
    }

    @Test
    fun test54() {
        assertSame(LanguageCode.de, getByCode("ger"))
    }

    @Test
    fun test55() {
        assertSame(LanguageCode.el, getByCode("el"))
    }

    @Test
    fun test56() {
        assertSame(LanguageCode.el, getByCode("ell"))
    }

    @Test
    fun test57() {
        assertSame(LanguageCode.el, getByCode("gre"))
    }

    @Test
    fun test58() {
        assertSame(LanguageCode.fa, getByCode("fa"))
    }

    @Test
    fun test59() {
        assertSame(LanguageCode.fa, getByCode("per"))
    }

    @Test
    fun test60() {
        assertSame(LanguageCode.fa, getByCode("fas"))
    }

    @Test
    fun test61() {
        assertSame(LanguageCode.fr, getByCode("fr"))
    }

    @Test
    fun test62() {
        assertSame(LanguageCode.fr, getByCode("fra"))
    }

    @Test
    fun test63() {
        assertSame(LanguageCode.fr, getByCode("fre"))
    }

    @Test
    fun test64() {
        assertSame(LanguageCode.hy, getByCode("hy"))
    }

    @Test
    fun test65() {
        assertSame(LanguageCode.hy, getByCode("hye"))
    }

    @Test
    fun test66() {
        assertSame(LanguageCode.hy, getByCode("arm"))
    }

    @Test
    fun test67() {
        assertSame(LanguageCode.`is`, getByCode("is"))
    }

    @Test
    fun test68() {
        assertSame(LanguageCode.`is`, getByCode("isl"))
    }

    @Test
    fun test69() {
        assertSame(LanguageCode.`is`, getByCode("ice"))
    }

    @Test
    fun test70() {
        assertSame(LanguageCode.ka, getByCode("ka"))
    }

    @Test
    fun test71() {
        assertSame(LanguageCode.ka, getByCode("kat"))
    }

    @Test
    fun test72() {
        assertSame(LanguageCode.ka, getByCode("geo"))
    }

    @Test
    fun test73() {
        assertSame(LanguageCode.mi, getByCode("mi"))
    }

    @Test
    fun test74() {
        assertSame(LanguageCode.mi, getByCode("mri"))
    }

    @Test
    fun test75() {
        assertSame(LanguageCode.mi, getByCode("mao"))
    }

    @Test
    fun test76() {
        assertSame(LanguageCode.mk, getByCode("mk"))
    }

    @Test
    fun test77() {
        assertSame(LanguageCode.mk, getByCode("mkd"))
    }

    @Test
    fun test78() {
        assertSame(LanguageCode.mk, getByCode("mac"))
    }

    @Test
    fun test79() {
        assertSame(LanguageCode.ms, getByCode("ms"))
    }

    @Test
    fun test80() {
        assertSame(LanguageCode.ms, getByCode("msa"))
    }

    @Test
    fun test81() {
        assertSame(LanguageCode.ms, getByCode("may"))
    }

    @Test
    fun test82() {
        assertSame(LanguageCode.my, getByCode("my"))
    }

    @Test
    fun test83() {
        assertSame(LanguageCode.my, getByCode("mya"))
    }

    @Test
    fun test84() {
        assertSame(LanguageCode.my, getByCode("bur"))
    }

    @Test
    fun test85() {
        assertSame(LanguageCode.nl, getByCode("nl"))
    }

    @Test
    fun test86() {
        assertSame(LanguageCode.nl, getByCode("nld"))
    }

    @Test
    fun test87() {
        assertSame(LanguageCode.nl, getByCode("dut"))
    }

    @Test
    fun test88() {
        assertSame(LanguageCode.ro, getByCode("ro"))
    }

    @Test
    fun test89() {
        assertSame(LanguageCode.ro, getByCode("ron"))
    }

    @Test
    fun test90() {
        assertSame(LanguageCode.ro, getByCode("rum"))
    }

    @Test
    fun test91() {
        assertSame(LanguageCode.sk, getByCode("sk"))
    }

    @Test
    fun test92() {
        assertSame(LanguageCode.sk, getByCode("slk"))
    }

    @Test
    fun test93() {
        assertSame(LanguageCode.sk, getByCode("slo"))
    }

    @Test
    fun test94() {
        assertSame(LanguageCode.sq, getByCode("sq"))
    }

    @Test
    fun test95() {
        assertSame(LanguageCode.sq, getByCode("sqi"))
    }

    @Test
    fun test96() {
        assertSame(LanguageCode.sq, getByCode("alb"))
    }

    @Test
    fun test97() {
        assertSame(LanguageAlpha3Code.bod, LanguageCode.bo.getAlpha3())
    }

    @Test
    fun test98() {
        assertSame(LanguageAlpha3Code.eus, LanguageCode.eu.getAlpha3())
    }

    @Test
    fun test99() {
        assertSame(LanguageAlpha3Code.ces, LanguageCode.cs.getAlpha3())
    }

    @Test
    fun test100() {
        assertSame(LanguageAlpha3Code.cym, LanguageCode.cy.getAlpha3())
    }

    @Test
    fun test101() {
        assertSame(LanguageAlpha3Code.deu, LanguageCode.de.getAlpha3())
    }

    @Test
    fun test102() {
        assertSame(LanguageAlpha3Code.ell, LanguageCode.el.getAlpha3())
    }

    @Test
    fun test103() {
        assertSame(LanguageAlpha3Code.fas, LanguageCode.fa.getAlpha3())
    }

    @Test
    fun test104() {
        assertSame(LanguageAlpha3Code.fra, LanguageCode.fr.getAlpha3())
    }

    @Test
    fun test105() {
        assertSame(LanguageAlpha3Code.hye, LanguageCode.hy.getAlpha3())
    }

    @Test
    fun test106() {
        assertSame(LanguageAlpha3Code.isl, LanguageCode.`is`.getAlpha3())
    }

    @Test
    fun test107() {
        assertSame(LanguageAlpha3Code.kat, LanguageCode.ka.getAlpha3())
    }

    @Test
    fun test108() {
        assertSame(LanguageAlpha3Code.mri, LanguageCode.mi.getAlpha3())
    }

    @Test
    fun test109() {
        assertSame(LanguageAlpha3Code.mkd, LanguageCode.mk.getAlpha3())
    }

    @Test
    fun test110() {
        assertSame(LanguageAlpha3Code.msa, LanguageCode.ms.getAlpha3())
    }

    @Test
    fun test111() {
        assertSame(LanguageAlpha3Code.mya, LanguageCode.my.getAlpha3())
    }

    @Test
    fun test112() {
        assertSame(LanguageAlpha3Code.nld, LanguageCode.nl.getAlpha3())
    }

    @Test
    fun test113() {
        assertSame(LanguageAlpha3Code.ron, LanguageCode.ro.getAlpha3())
    }

    @Test
    fun test114() {
        assertSame(LanguageAlpha3Code.slk, LanguageCode.sk.getAlpha3())
    }

    @Test
    fun test115() {
        assertSame(LanguageAlpha3Code.sqi, LanguageCode.sq.getAlpha3())
    }

    @Test
    fun test116() {
        assertSame(LanguageAlpha3Code.jpn, LanguageCode.ja.getAlpha3())
    }

    @Test
    fun test117() {
        assertSame("Japanese", LanguageCode.ja.getValue())
    }

    @Test
    fun test118() {
        val list: List<LanguageCode> = LanguageCode.findByValue(".*nese")
        assertEquals(5, list.size)

        // an : Aragonese
        assertTrue(list.contains(LanguageCode.an))

        // ja : Japanese
        assertTrue(list.contains(LanguageCode.ja))

        // jv : Javanese
        assertTrue(list.contains(LanguageCode.jv))

        // su : Sudanese
        assertTrue(list.contains(LanguageCode.su))

        // zh : Chinese
        assertTrue(list.contains(LanguageCode.zh))
    }

    @Test
    fun test119() {
        assertSame(LanguageCode.undefined, getByCode("undefined"))
    }

    @Test
    fun test120() {
        assertNull(getByCode("UNDEFINED"))
    }

    @Test
    fun test121() {
        assertSame(LanguageCode.undefined, getByCode("UNDEFINED", false))
    }
}
