/*
 * $Id: VMPipe.java 5226 2009-04-06 14:55:27Z lsantha $
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

package gnu.java.nio;

import java.io.IOException;
import java.nio.channels.spi.SelectorProvider;
import gnu.classpath.Configuration;

/**
 * This class contains the native methods for gnu.java.nio.PipeImpl
 * As such, it needs help from the VM.
 *
 * @author Patrik Reali
 */
final class VMPipe
{

  static
  {
    // load the shared library needed for native methods.
    if (Configuration.INIT_LOAD_LIBRARY)
      {
        System.loadLibrary ("javanio");
      }
  }

  static native void init(PipeImpl self, SelectorProvider provider)
    throws IOException;
}
