/*
 * Copyright 2003-2007 Keith Seymour.
 * Copyright 1992-2007 The University of Tennessee. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * 
 * - Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 * 
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer listed
 *   in this license in the documentation and/or other materials
 *   provided with the distribution.
 * 
 * - Neither the name of the copyright holders nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 * This file was auto-generated by the org.netlib.generate.JavaGenerator
 * program, a part of netlib-java.
 * 
 * @see http://code.google.com/p/netlib-java/
 */
package org.netlib.arpack;

import java.util.logging.Logger;
import org.netlib.util.StringW;
import org.netlib.util.booleanW;
import org.netlib.util.doubleW;
import org.netlib.util.floatW;
import org.netlib.util.intW;

/**
 * ARPACK provider implementation which uses F2J.
 *
 * @see http://sourceforge.net/projects/f2j
 * @author Samuel Halliday
 */
final class JARPACK extends ARPACK {

	static final ARPACK INSTANCE = new JARPACK();

	private JARPACK() {
	}

	@Override
	public void dnaupd(intW arg1, String arg2, int arg3, String arg4, int arg5, doubleW arg6, double[] arg7, int arg9, double[] arg10, int arg12, int[] arg13, int[] arg15, double[] arg17, double[] arg19, int arg21, intW arg22) {
		org.netlib.arpack.Dnaupd.dnaupd(arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg9, arg10, 0, arg12, arg13, 0, arg15, 0, arg17, 0, arg19, 0, arg21, arg22);
	}

	@Override
	public void dneupd(boolean arg1, String arg2, boolean[] arg3, double[] arg5, double[] arg7, double[] arg9, int arg11, double arg12, double arg13, double[] arg14, String arg16, int arg17, String arg18, intW arg19, double arg20, double[] arg21, int arg23, double[] arg24, int arg26, int[] arg27, int[] arg29, double[] arg31, double[] arg33, int arg35, intW arg36) {
		org.netlib.arpack.Dneupd.dneupd(arg1, arg2, arg3, 0, arg5, 0, arg7, 0, arg9, 0, arg11, arg12, arg13, arg14, 0, arg16, arg17, arg18, arg19, arg20, arg21, 0, arg23, arg24, 0, arg26, arg27, 0, arg29, 0, arg31, 0, arg33, 0, arg35, arg36);
	}

	@Override
	public void dsaupd(intW arg1, String arg2, int arg3, String arg4, int arg5, doubleW arg6, double[] arg7, int arg9, double[] arg10, int arg12, int[] arg13, int[] arg15, double[] arg17, double[] arg19, int arg21, intW arg22) {
		org.netlib.arpack.Dsaupd.dsaupd(arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg9, arg10, 0, arg12, arg13, 0, arg15, 0, arg17, 0, arg19, 0, arg21, arg22);
	}

	@Override
	public void dseupd(boolean arg1, String arg2, boolean[] arg3, double[] arg5, double[] arg7, int arg9, double arg10, String arg11, int arg12, String arg13, intW arg14, double arg15, double[] arg16, int arg18, double[] arg19, int arg21, int[] arg22, int[] arg24, double[] arg26, double[] arg28, int arg30, intW arg31) {
		org.netlib.arpack.Dseupd.dseupd(arg1, arg2, arg3, 0, arg5, 0, arg7, 0, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, 0, arg18, arg19, 0, arg21, arg22, 0, arg24, 0, arg26, 0, arg28, 0, arg30, arg31);
	}

	@Override
	public void snaupd(intW arg1, String arg2, int arg3, String arg4, int arg5, floatW arg6, float[] arg7, int arg9, float[] arg10, int arg12, int[] arg13, int[] arg15, float[] arg17, float[] arg19, int arg21, intW arg22) {
		org.netlib.arpack.Snaupd.snaupd(arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg9, arg10, 0, arg12, arg13, 0, arg15, 0, arg17, 0, arg19, 0, arg21, arg22);
	}

	@Override
	public void sneupd(boolean arg1, String arg2, boolean[] arg3, float[] arg5, float[] arg7, float[] arg9, int arg11, float arg12, float arg13, float[] arg14, String arg16, int arg17, String arg18, intW arg19, float arg20, float[] arg21, int arg23, float[] arg24, int arg26, int[] arg27, int[] arg29, float[] arg31, float[] arg33, int arg35, intW arg36) {
		org.netlib.arpack.Sneupd.sneupd(arg1, arg2, arg3, 0, arg5, 0, arg7, 0, arg9, 0, arg11, arg12, arg13, arg14, 0, arg16, arg17, arg18, arg19, arg20, arg21, 0, arg23, arg24, 0, arg26, arg27, 0, arg29, 0, arg31, 0, arg33, 0, arg35, arg36);
	}

	@Override
	public void ssaupd(intW arg1, String arg2, int arg3, String arg4, int arg5, floatW arg6, float[] arg7, int arg9, float[] arg10, int arg12, int[] arg13, int[] arg15, float[] arg17, float[] arg19, int arg21, intW arg22) {
		org.netlib.arpack.Ssaupd.ssaupd(arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg9, arg10, 0, arg12, arg13, 0, arg15, 0, arg17, 0, arg19, 0, arg21, arg22);
	}

	@Override
	public void sseupd(boolean arg1, String arg2, boolean[] arg3, float[] arg5, float[] arg7, int arg9, float arg10, String arg11, int arg12, String arg13, intW arg14, float arg15, float[] arg16, int arg18, float[] arg19, int arg21, int[] arg22, int[] arg24, float[] arg26, float[] arg28, int arg30, intW arg31) {
		org.netlib.arpack.Sseupd.sseupd(arg1, arg2, arg3, 0, arg5, 0, arg7, 0, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, 0, arg18, arg19, 0, arg21, arg22, 0, arg24, 0, arg26, 0, arg28, 0, arg30, arg31);
	}

}
