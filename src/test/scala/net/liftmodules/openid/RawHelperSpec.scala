/*
 * Copyright 2010-2011 WorldWide Conferencing, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.liftmodules
package openid

import java.util.{List, ArrayList}

import org.specs.Specification


class RawHelperSpec extends Specification {
  "RawUtils" should {
    "Convert a java.util.List" in {
      val org: List[Object] = new ArrayList[Object]()
      
      org.add("Hello")
      org.add("Woof")

      RawHelper.rawJUL2List[String](org) must_== scala.List("Hello", "Woof")
    }
  }
}
