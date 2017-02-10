/**
 *  Copyright 2017 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */

package org.jboss.openshift.valves;

import java.io.CharArrayWriter;

import org.apache.catalina.valves.AccessLogValve;

/**
 * @author <a href="mailto:rmartine@redhat.com">Ricardo Martinelli</a>
 */
public class StdoutAccessLogValve extends AccessLogValve {
	
	@Override
	public boolean isRotatable() {
		return false;
	}

	@Override
	public void rotate() {
		// Do nothing
	}

	@Override
	public synchronized boolean rotate(String newFileName) {
		return true;
	}
	
	@Override
	public void log(CharArrayWriter message) {
		System.out.println(message);
	}

}