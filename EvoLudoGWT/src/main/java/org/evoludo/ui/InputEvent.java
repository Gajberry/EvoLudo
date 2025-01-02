//
// EvoLudo Project
//
// Copyright 2010-2025 Christoph Hauert
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//	http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
// For publications in any form, you are kindly requested to attribute the
// author and project as follows:
//
//	Hauert, Christoph (<year>) EvoLudo Project, https://www.evoludo.org
//			(doi: <doi>[, <version>])
//
//	<doi>:	digital object identifier of the downloaded release (or the
//			most recent release if downloaded from github.com),
//	<year>:	year of release (or download), and
//	[, <version>]: optional version number (as reported in output header
//			or GUI console) to simplify replication of reported results.
//
// The formatting may be adjusted to comply with publisher requirements.
//

package org.evoludo.ui;

import com.google.gwt.event.dom.client.DomEvent;

/**
 * Represents a native input event.
 * 
 * @see <a href=
 *      "http://gwt-code-reviews.appspot.com/1248801/">http://gwt-code-reviews.appspot.com/1248801/</a>
 */
public class InputEvent extends DomEvent<InputHandler> {

	/**
	 * Name of input event.
	 */
	public static final String INPUT = "input";

	/**
	 * Event type for input events. Represents the meta-data associated with this
	 * event.
	 */
	private static final Type<InputHandler> TYPE = new Type<InputHandler>(INPUT, new InputEvent());

	/**
	 * Gets the event type associated with input events.
	 *
	 * @return the handler type
	 */
	public static Type<InputHandler> getType() {
		return TYPE;
	}

	/**
	 * Protected constructor, use
	 * {@link DomEvent#fireNativeEvent(com.google.gwt.dom.client.NativeEvent, com.google.gwt.event.shared.HasHandlers)}
	 * to fire input events.
	 */
	protected InputEvent() {
	}

	@Override
	public final Type<InputHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(InputHandler handler) {
		handler.onInput(this);
	}
}
