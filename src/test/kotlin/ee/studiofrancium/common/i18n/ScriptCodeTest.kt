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

internal class ScriptCodeTest {
    @Test
    fun test1() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCode("Jpan"))
    }

    @Test
    fun test2() {
        assertNull(ScriptCode.getByCode("JPan"))
    }

    @Test
    fun test3() {
        assertNull(ScriptCode.getByCode("JpAn"))
    }

    @Test
    fun test4() {
        assertNull(ScriptCode.getByCode("JpaN"))
    }

    @Test
    fun test5() {
        assertNull(ScriptCode.getByCode("jpan"))
    }

    @Test
    fun test6() {
        assertNull(ScriptCode.getByCode("jPan"))
    }

    @Test
    fun test7() {
        assertNull(ScriptCode.getByCode("jpAn"))
    }

    @Test
    fun test8() {
        assertNull(ScriptCode.getByCode("jpaN"))
    }

    @Test
    fun test9() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCode("Jpan", true))
    }

    @Test
    fun test10() {
        assertNull(ScriptCode.getByCode("JPan", true))
    }

    @Test
    fun test11() {
        assertNull(ScriptCode.getByCode("JpAn", true))
    }

    @Test
    fun test12() {
        assertNull(ScriptCode.getByCode("JpaN", true))
    }

    @Test
    fun test13() {
        assertNull(ScriptCode.getByCode("jpan", true))
    }

    @Test
    fun test14() {
        assertNull(ScriptCode.getByCode("jPan", true))
    }

    @Test
    fun test15() {
        assertNull(ScriptCode.getByCode("jpAn", true))
    }

    @Test
    fun test16() {
        assertNull(ScriptCode.getByCode("jpaN", true))
    }

    @Test
    fun test17() {
        assertNull(ScriptCode.getByCode(null))
    }

    @Test
    fun test18() {
        assertNull(ScriptCode.getByCode(""))
    }

    @Test
    fun test19() {
        assertNull(ScriptCode.getByCode("?"))
    }

    @Test
    fun test20() {
        assertNull(ScriptCode.getByCode("??"))
    }

    @Test
    fun test21() {
        assertNull(ScriptCode.getByCode("???"))
    }

    @Test
    fun test22() {
        assertNull(ScriptCode.getByCode("????"))
    }

    @Test
    fun test23() {
        assertNull(ScriptCode.getByCode("?????"))
    }

    @Test
    fun test24() {
        assertNull(ScriptCode.getByCode(null, true))
    }

    @Test
    fun test25() {
        assertNull(ScriptCode.getByCode("", true))
    }

    @Test
    fun test26() {
        assertNull(ScriptCode.getByCode("?", true))
    }

    @Test
    fun test27() {
        assertNull(ScriptCode.getByCode("??", true))
    }

    @Test
    fun test28() {
        assertNull(ScriptCode.getByCode("???", true))
    }

    @Test
    fun test29() {
        assertNull(ScriptCode.getByCode("????", true))
    }

    @Test
    fun test30() {
        assertNull(ScriptCode.getByCode("?????", true))
    }

    @Test
    fun test31() {
        assertNull(ScriptCode.getByCode(0))
    }

    @Test
    fun test32() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCode(413))
    }

    @Test
    fun test33() {
        val list: List<ScriptCode> = ScriptCode.findByName("Egyptian.*")
        assertEquals(3, list.size)

        // Egyd : Egyptian demotic
        assertTrue(list.contains(ScriptCode.Egyd))

        // Egyh : Egyptian hieratic
        assertTrue(list.contains(ScriptCode.Egyh))

        // Egyp : Egyptian hieroglyps
        assertTrue(list.contains(ScriptCode.Egyp))
    }

    @Test
    fun test34() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCode("Jpan", false))
    }

    @Test
    fun test35() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCode("JPan", false))
    }

    @Test
    fun test36() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCode("JpAn", false))
    }

    @Test
    fun test37() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCode("JpaN", false))
    }

    @Test
    fun test38() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCode("jpan", false))
    }

    @Test
    fun test39() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCode("jPan", false))
    }

    @Test
    fun test40() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCode("jpAn", false))
    }

    @Test
    fun test41() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCode("jpaN", false))
    }

    @Test
    fun test42() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCodeIgnoreCase("Jpan"))
    }

    @Test
    fun test43() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCodeIgnoreCase("JPan"))
    }

    @Test
    fun test44() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCodeIgnoreCase("JpAn"))
    }

    @Test
    fun test45() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCodeIgnoreCase("JpaN"))
    }

    @Test
    fun test46() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCodeIgnoreCase("jpan"))
    }

    @Test
    fun test47() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCodeIgnoreCase("jPan"))
    }

    @Test
    fun test48() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCodeIgnoreCase("jpAn"))
    }

    @Test
    fun test49() {
        assertSame(ScriptCode.Jpan, ScriptCode.getByCodeIgnoreCase("jpaN"))
    }

    @Test
    fun test50() {
        assertSame(ScriptCode.Undefined, ScriptCode.getByCode("Undefined"))
    }

    @Test
    fun test51() {
        assertNull(ScriptCode.getByCode("UNDEFINED"))
    }

    @Test
    fun test52() {
        assertSame(ScriptCode.Undefined, ScriptCode.getByCodeIgnoreCase("UNDEFINED"))
    }
}
