/*
 * Copyright (C) 2014 Neo Visionaries Inc.
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

internal class CurrencyCodeTest {

    @Test
    fun test1() {
        assertSame(CurrencyCode.JPY, CurrencyCode.getByCode("JPY"))
    }

    @Test
    fun test2() {
        assertNull(CurrencyCode.getByCode("jpy"))
    }

    @Test
    fun test3() {
        assertSame(CurrencyCode.JPY, CurrencyCode.getByCode("JPY", true))
    }

    @Test
    fun test4() {
        assertNull(CurrencyCode.getByCode("jpy", true))
    }

    @Test
    fun test5() {
        assertSame(CurrencyCode.JPY, CurrencyCode.getByCode("JPY", false))
    }

    @Test
    fun test6() {
        assertSame(CurrencyCode.JPY, CurrencyCode.getByCode("jpy", false))
    }

    @Test
    fun test7() {
        assertNull(CurrencyCode.getByCode(null))
    }

    @Test
    fun test8() {
        assertNull(CurrencyCode.getByCode(""))
    }

    @Test
    fun test9() {
        assertNull(CurrencyCode.getByCode("???"))
    }

    @Test
    fun test10() {
        assertFalse(CurrencyCode.JPY.isFund())
        assertTrue(CurrencyCode.BOV.isFund())
        assertTrue(CurrencyCode.CHE.isFund())
        assertTrue(CurrencyCode.CHW.isFund())
        assertTrue(CurrencyCode.CLF.isFund())
        assertTrue(CurrencyCode.COU.isFund())
        assertTrue(CurrencyCode.MXV.isFund())
        assertTrue(CurrencyCode.USN.isFund())
        assertTrue(CurrencyCode.USS.isFund())
        assertTrue(CurrencyCode.UYI.isFund())
    }

    @Test
    fun test11() {
        assertFalse(CurrencyCode.JPY.isPreciousMetal())
        assertTrue(CurrencyCode.XAG.isPreciousMetal())
        assertTrue(CurrencyCode.XAU.isPreciousMetal())
        assertTrue(CurrencyCode.XPD.isPreciousMetal())
        assertTrue(CurrencyCode.XPT.isPreciousMetal())
    }

    @Test
    fun test12() {
        val list = CurrencyCode.JPY.countryList
        assertEquals(1, list.size)
        assertSame(CountryCode.JP, list[0])
    }

    @Test
    fun test13() {
        val list = CurrencyCode.XXX.countryList
        assertEquals(0, list.size)
    }

    @Test
    fun test14() {
        val list: List<CurrencyCode> = CurrencyCode.findByValue(".*Ruble")
        assertEquals(4, list.size)

        // BYN: Belarusian Ruble
        assertTrue(list.contains(CurrencyCode.BYN))

        // BYR: Belarusian Ruble
        assertTrue(list.contains(CurrencyCode.BYR))

        // RUB: Russian Ruble
        assertTrue(list.contains(CurrencyCode.RUB))

        // RUR: Russian Ruble before the 1998 denomination
        assertTrue(list.contains(CurrencyCode.RUR))
    }

    @Test
    fun test15() {
        assertSame(CurrencyCode.UNDEFINED, CurrencyCode.getByCode("UNDEFINED"))
    }

    @Test
    fun test16() {
        assertNull(CurrencyCode.getByCode("undefined"))
    }

    @Test
    fun test17() {
        assertSame(CurrencyCode.UNDEFINED, CurrencyCode.getByCode("undefined", false))
    }
}
