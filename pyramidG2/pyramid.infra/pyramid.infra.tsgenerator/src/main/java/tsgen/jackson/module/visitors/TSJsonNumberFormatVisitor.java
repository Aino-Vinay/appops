/*******************************************************************************
 * Copyright 2013 Raphael Jolivet
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package tsgen.jackson.module.visitors;

import java.util.Set;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

import tsgen.jackson.module.Configuration;
import tsgen.jackson.module.grammar.NumberType;

public class TSJsonNumberFormatVisitor extends ABaseTSJsonFormatVisitor<NumberType> implements JsonNumberFormatVisitor,
		JsonIntegerFormatVisitor {

	public TSJsonNumberFormatVisitor(ABaseTSJsonFormatVisitor parentHolder, Configuration conf) {
		super(parentHolder, conf);
		type = NumberType.getInstance();
	}

	public void format(JsonValueFormat format) {
	}

	public void enumTypes(Set<String> enums) {
	}

	public void numberType(com.fasterxml.jackson.core.JsonParser.NumberType type) {

	}

}
