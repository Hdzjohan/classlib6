/*
 * $Id: VMChannels.java 5209 2009-04-01 18:57:30Z lsantha $
 *
 * Copyright (C) 2003-2009 JNode.org
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public 
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; If not, write to the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package java.nio.channels;

import java.io.InputStream;
import java.io.OutputStream;

final class VMChannels {
	/**
	 * This class isn't intended to be instantiated.
	 */
	private VMChannels() {
		// Do nothing here.
	}

	/**
	 * Constructs a stream that reads bytes from the given channel.
	 */
	native static InputStream newInputStream(ReadableByteChannel ch);

	/**
	 * Constructs a stream that writes bytes to the given channel.
	 */
	native static OutputStream newOutputStream(WritableByteChannel ch);
}
