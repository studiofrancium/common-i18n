/*
 * Copyright (C) 2014-2015 Neo Visionaries Inc.
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

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*

internal class CountryCodeTest {
    @Test
    fun test1() {
        val list: List<CountryCode> = CountryCode.findByName(".*United.*")
        assertEquals(6, list.size)

        // AE: United Arab Emirates
        assertTrue(list.contains(CountryCode.AE))

        // GB: United Kingdom
        assertTrue(list.contains(CountryCode.GB))

        // TZ: Tanzania, United Republic of
        assertTrue(list.contains(CountryCode.TZ))

        // UK: United Kingdom
        assertTrue(list.contains(CountryCode.UK))

        // UM: United States Minor Outlying Islands
        assertTrue(list.contains(CountryCode.UM))

        // US: United States
        assertTrue(list.contains(CountryCode.US))
    }

    @Test
    fun test2() {
        assertSame(Locale.CANADA, CountryCode.CA.toLocale())
    }

    @Test
    fun test3() {
        assertSame(Locale.CHINA, CountryCode.CN.toLocale())
    }

    @Test
    fun test4() {
        assertSame(Locale.GERMANY, CountryCode.DE.toLocale())
    }

    @Test
    fun test5() {
        assertSame(Locale.FRANCE, CountryCode.FR.toLocale())
    }

    @Test
    fun test6() {
        assertSame(Locale.UK, CountryCode.GB.toLocale())
    }

    @Test
    fun test7() {
        assertSame(Locale.ITALY, CountryCode.IT.toLocale())
    }

    @Test
    fun test8() {
        assertSame(Locale.JAPAN, CountryCode.JP.toLocale())
    }

    @Test
    fun test9() {
        assertSame(Locale.KOREA, CountryCode.KR.toLocale())
    }

    @Test
    fun test10() {
        assertSame(Locale.TAIWAN, CountryCode.TW.toLocale())
    }

    @Test
    fun test11() {
        assertSame(Locale.US, CountryCode.US.toLocale())
    }

    @Test
    fun test12() {
        val undefinedLocale = CountryCode.UNDEFINED.toLocale()
        try {
            val root = Locale::class.java.getDeclaredField("ROOT")[null] as Locale
            assertSame(root, undefinedLocale)
        } catch (e: Exception) {
            assertEquals("", undefinedLocale!!.language)
            assertEquals("", undefinedLocale.country)
        }
    }

    @Test
    fun test13() {
        assertSame(CountryCode.UNDEFINED, CountryCode.getByCode("UNDEFINED"))
    }

    @Test
    fun test14() {
        assertNull(CountryCode.getByCode("undefined"))
    }

    @Test
    fun test15() {
        assertSame(CountryCode.UNDEFINED, CountryCode.getByCodeIgnoreCase("undefined"))
    }

    @Test
    fun test16() {
        assertSame(CountryCode.UNDEFINED, CountryCode.getByLocale(Locale("", "")))
    }

    @Test
    fun test17() {
        assertNull(CountryCode.getByCode(null))
    }

    @Test
    fun test18() {
        assertNull(CountryCode.getByCode(""))
    }

    @Test
    fun test19() {
        assertSame(CountryCode.AN, CountryCode.getByCode("ANT"))
    }

    @Test
    fun test20() {
        assertSame(CountryCode.AN, CountryCode.getByCode("ANHH"))
    }

    @Test
    fun test21() {
        assertSame(CountryCode.BU, CountryCode.getByCode("BUR"))
    }

    @Test
    fun test22() {
        assertSame(CountryCode.BU, CountryCode.getByCode("BUMM"))
    }

    @Test
    fun test23() {
        assertSame(CountryCode.CS, CountryCode.getByCode("SCG"))
    }

    @Test
    fun test24() {
        assertSame(CountryCode.CS, CountryCode.getByCode("CSXX"))
    }

    @Test
    fun test25() {
        assertSame(CountryCode.NT, CountryCode.getByCode("NTZ"))
    }

    @Test
    fun test26() {
        assertSame(CountryCode.NT, CountryCode.getByCode("NTHH"))
    }

    @Test
    fun test27() {
        assertSame(CountryCode.TP, CountryCode.getByCode("TMP"))
    }

    @Test
    fun test28() {
        assertSame(CountryCode.TP, CountryCode.getByCode("TPTL"))
    }

    @Test
    fun test29() {
        assertSame(CountryCode.YU, CountryCode.getByCode("YUG"))
    }

    @Test
    fun test30() {
        assertSame(CountryCode.YU, CountryCode.getByCode("YUCS"))
    }

    @Test
    fun test31() {
        assertSame(CountryCode.ZR, CountryCode.getByCode("ZAR"))
    }

    @Test
    fun test32() {
        assertSame(CountryCode.ZR, CountryCode.getByCode("ZRCD"))
    }

    @Test
    fun test33() {
        for (cc in CountryCode.values()) {
            val alpha3 = cc.alpha3 ?: continue
            assertEquals(3, alpha3.length)
        }
    }

    @Test
    fun test34() {
        // FI and SF have the same alpha-3 code "FIN".
        // FI should be returned for "FIN".
        assertSame(CountryCode.FI, CountryCode.getByCode("FIN"))
    }

    @Test
    fun test35() {
        // BU and MM have the same numeric code 104. MM should be used.
        assertSame(CountryCode.MM, CountryCode.getByCode(104))
        assertSame(CountryCode.MM, CountryCode.getByCode(CountryCode.BU.numeric))
        assertSame(CountryCode.MM, CountryCode.getByCode(CountryCode.MM.numeric))
    }

    @Test
    fun test36() {
        // CD and ZR have the same numeric code 180. CD should be used.
        assertSame(CountryCode.CD, CountryCode.getByCode(180))
        assertSame(CountryCode.CD, CountryCode.getByCode(CountryCode.CD.numeric))
        assertSame(CountryCode.CD, CountryCode.getByCode(CountryCode.ZR.numeric))
    }

    @Test
    fun test37() {
        // FI and SF have the same numeric code 246. FI should be used.
        assertSame(CountryCode.FI, CountryCode.getByCode(246))
        assertSame(CountryCode.FI, CountryCode.getByCode(CountryCode.FI.numeric))
        assertSame(CountryCode.FI, CountryCode.getByCode(CountryCode.SF.numeric))
    }

    @Test
    fun test38() {
        // GB and UK have the same numeric code 826. GB should be used.
        assertSame(CountryCode.GB, CountryCode.getByCode(826))
        assertSame(CountryCode.GB, CountryCode.getByCode(CountryCode.GB.numeric))
        assertSame(CountryCode.GB, CountryCode.getByCode(CountryCode.UK.numeric))
    }

    @Test
    fun test39() {
        // TL and TP have the same numeric code 626. GB should be used.
        assertSame(CountryCode.TL, CountryCode.getByCode(626))
        assertSame(CountryCode.TL, CountryCode.getByCode(CountryCode.TL.numeric))
        assertSame(CountryCode.TL, CountryCode.getByCode(CountryCode.TP.numeric))
    }

    @Test
    fun test40() {
        assertSame(CountryCode.JP, CountryCode.getByCode(392))
    }

    @Test
    fun test41() {
        // Checks changed made in version 1.17.
        assertEquals(249, CountryCode.FX.numeric)
        assertEquals(810, CountryCode.SU.numeric)
        assertEquals(626, CountryCode.TP.numeric)
        assertEquals(826, CountryCode.UK.numeric)
        assertEquals(180, CountryCode.ZR.numeric)
    }

    @Test
    fun test42() {
        // Country code 280 should map to 278, due to legacy applications in payment industry.
        assertEquals(CountryCode.DE, CountryCode.getByCode(280))
    }
}
