/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.spin.json;

import org.camunda.spin.Spin;
import org.camunda.spin.SpinList;

import java.util.ArrayList;

/**
 * A json node.
 * 
 * @author Thorben Lindhauer
 * @author Stefan Hentschel
 */
public abstract class SpinJsonNode extends Spin<SpinJsonNode> {

  public abstract SpinJsonNode prop(String name);

  public abstract Boolean boolValue();

  public abstract Number numberValue();

  public abstract String value();

  public abstract SpinList elements();

  public abstract ArrayList<String> fieldNames();
}