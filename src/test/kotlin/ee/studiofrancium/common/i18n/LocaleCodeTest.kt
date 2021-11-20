/*
 * Copyright (C) 2013-2014 Neo Visionaries Inc.
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

internal class LocaleCodeTest {
    @Test
    fun test1() {
        val expected: MutableList<LocaleCode> = ArrayList()
        expected.add(LocaleCode.ar)
        expected.add(LocaleCode.ar_AE)
        expected.add(LocaleCode.ar_BH)
        expected.add(LocaleCode.ar_DZ)
        expected.add(LocaleCode.ar_EG)
        expected.add(LocaleCode.ar_IQ)
        expected.add(LocaleCode.ar_JO)
        expected.add(LocaleCode.ar_KW)
        expected.add(LocaleCode.ar_LB)
        expected.add(LocaleCode.ar_LY)
        expected.add(LocaleCode.ar_MA)
        expected.add(LocaleCode.ar_OM)
        expected.add(LocaleCode.ar_QA)
        expected.add(LocaleCode.ar_SA)
        expected.add(LocaleCode.ar_SD)
        expected.add(LocaleCode.ar_SY)
        expected.add(LocaleCode.ar_TN)
        expected.add(LocaleCode.ar_YE)
        val actual: List<LocaleCode> = LocaleCode.getByLanguage(LanguageCode.ar)
        assertListEquals(expected, actual)
    }

    @Test
    fun test2() {
        val expected: List<LocaleCode> = ArrayList()
        val actual: List<LocaleCode> = LocaleCode.getByLanguage(null as LanguageCode?)
        assertListEquals(expected, actual)
    }

    @Test
    fun test3() {
        val expected: MutableList<LocaleCode> = ArrayList()
        expected.add(LocaleCode.de_CH)
        expected.add(LocaleCode.fr_CH)
        expected.add(LocaleCode.it_CH)
        val actual: List<LocaleCode> = LocaleCode.getByCountry(CountryCode.CH)
        assertListEquals(expected, actual)
    }

    @Test
    fun test4() {
        val expected: List<LocaleCode> = ArrayList()
        val actual: List<LocaleCode> = LocaleCode.getByCountry(null as CountryCode?)
        assertListEquals(expected, actual)
    }

    @Test
    fun test5() {
        assertSame(Locale.GERMAN, LocaleCode.de.toLocale())
    }

    @Test
    fun test6() {
        assertSame(Locale.ENGLISH, LocaleCode.en.toLocale())
    }

    @Test
    fun test7() {
        assertSame(Locale.FRENCH, LocaleCode.fr.toLocale())
    }

    @Test
    fun test8() {
        assertSame(Locale.CANADA_FRENCH, LocaleCode.fr_CA.toLocale())
    }

    @Test
    fun test9() {
        assertSame(Locale.ITALIAN, LocaleCode.it.toLocale())
    }

    @Test
    fun test10() {
        assertSame(Locale.JAPANESE, LocaleCode.ja.toLocale())
    }

    @Test
    fun test11() {
        assertSame(Locale.KOREAN, LocaleCode.ko.toLocale())
    }

    @Test
    fun test12() {
        assertSame(Locale.CHINESE, LocaleCode.zh.toLocale())
    }

    @Test
    fun test13() {
        assertSame(Locale.SIMPLIFIED_CHINESE, LocaleCode.zh_CN.toLocale())
    }

    @Test
    fun test14() {
        assertSame(Locale.TRADITIONAL_CHINESE, LocaleCode.zh_TW.toLocale())
    }

    @Test
    fun test15() {
        val undefinedLocale = LocaleCode.undefined.toLocale()
        try {
            val root = Locale::class.java.getDeclaredField("ROOT")[null] as Locale
            assertSame(root, undefinedLocale)
        } catch (e: Exception) {
            assertEquals("", undefinedLocale.language)
            assertEquals("", undefinedLocale.country)
        }
    }

    @Test
    fun test16() {
        assertSame(LocaleCode.ja, LocaleCode.getByLocale(Locale.JAPANESE))
    }

    @Test
    fun test17() {
        assertSame(LocaleCode.ja_JP, LocaleCode.getByLocale(Locale.JAPAN))
    }

    @Test
    fun test18() {
        assertSame(LocaleCode.undefined, LocaleCode.getByLocale(Locale("", "")))
    }

    @Test
    fun test19() {
        assertSame(LocaleCode.undefined, LocaleCode.getByCode("undefined", null))
    }

    @Test
    fun test20() {
        assertNull(LocaleCode.getByCode("UNDEFINED", null))
    }

    @Test
    fun test21() {
        assertSame(LocaleCode.undefined, LocaleCode.getByCode("UNDEFINED", null, false))
    }

    @Test
    fun test22() {
        assertSame(LocaleCode.undefined, LocaleCode.getByCode("undefined", "UNDEFINED"))
    }

    @Test
    fun test23() {
        assertNull(LocaleCode.getByCode("undefined", "undefined"))
    }

    @Test
    fun test24() {
        assertSame(LocaleCode.undefined, LocaleCode.getByCode("undefined", "undefined", false))
    }

    @Test
    fun test25() {
        assertSame(LocaleCode.undefined, LocaleCode.getByCode("undefined"))
    }

    @Test
    fun test26() {
        assertNull(LocaleCode.getByCode("UNDEFINED"))
    }

    @Test
    fun test27() {
        assertSame(LocaleCode.undefined, LocaleCode.getByCode("UNDEFINED", false))
    }

    @Test
    fun test28() {
        assertSame(LocaleCode.undefined, LocaleCode.getByCode("undefined-UNDEFINED"))
    }

    @Test
    fun test29() {
        assertNull(LocaleCode.getByCode("undefined-undefined"))
    }

    @Test
    fun test30() {
        assertSame(LocaleCode.undefined, LocaleCode.getByCode("undefined-undefined", false))
    }

    @Test
    fun test31() {
        assertSame(LocaleCode.undefined, LocaleCode.getByCode("undefined_UNDEFINED"))
    }

    @Test
    fun test32() {
        assertNull(LocaleCode.getByCode("undefined_undefined"))
    }

    @Test
    fun test33() {
        assertSame(LocaleCode.undefined, LocaleCode.getByCode("undefined_undefined", false))
    }

    @Test
    fun test34() {
        assertSame(LocaleCode.ja, LocaleCode.getByCode("ja"))
    }

    @Test
    fun test35() {
        assertNull(LocaleCode.getByCode("JA"))
    }

    @Test
    fun test36() {
        assertSame(LocaleCode.ja, LocaleCode.getByCode("JA", false))
    }

    @Test
    fun test37() {
        assertSame(LocaleCode.ja_JP, LocaleCode.getByCode("ja-JP"))
    }

    @Test
    fun test38() {
        assertNull(LocaleCode.getByCode("ja-jp"))
    }

    @Test
    fun test39() {
        assertSame(LocaleCode.ja_JP, LocaleCode.getByCode("ja-jp", false))
    }

    @Test
    fun test40() {
        assertSame(LocaleCode.ja_JP, LocaleCode.getByCode("ja_JP"))
    }

    @Test
    fun test41() {
        assertNull(LocaleCode.getByCode("ja_jp"))
    }

    @Test
    fun test42() {
        assertSame(LocaleCode.ja_JP, LocaleCode.getByCode("ja_jp", false))
    }

    @Test
    fun test43() {
        assertNull(LocaleCode.getByCode("ja+JP"))
    }

    @Test
    fun test44() {
        assertNull(LocaleCode.getByCode(null))
    }

    @Test
    fun test45() {
        assertNull(LocaleCode.getByCode(""))
    }

    @Test
    fun test46() {
        assertSame(LocaleCode.ro_MD, LocaleCode.getByCode("ro_MD", false))
    }

    companion object {
        private fun assertListEquals(list1: List<LocaleCode>?, list2: List<LocaleCode>?) {
            if (list1 == null) {
                if (list2 == null) {
                    // Equals
                    return
                } else {
                    fail<Void>()
                    return
                }
            } else if (list2 == null) {
                fail<Void>()
                return
            }
            val size = list1.size
            if (size != list2.size) {
                fail<Void>()
                return
            }
            for (i in 0 until size) {
                if (list1[i] !== list2[i]) {
                    fail<Void>()
                    return
                }
            }
        }
    }
}
