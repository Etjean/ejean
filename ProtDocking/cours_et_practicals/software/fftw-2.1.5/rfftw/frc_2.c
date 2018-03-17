/*
 * Copyright (c) 1997-1999, 2003 Massachusetts Institute of Technology
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */

/* This file was automatically generated --- DO NOT EDIT */
/* Generated on Mon Mar 24 02:05:51 EST 2003 */

#include "fftw-int.h"
#include "fftw.h"

/* Generated by: /homee/stevenj/cvs/fftw/gensrc/genfft -magic-alignment-check -magic-twiddle-load-all -magic-variables 4 -magic-loopi -real2hc 2 */

/*
 * This function contains 2 FP additions, 0 FP multiplications,
 * (or, 2 additions, 0 multiplications, 0 fused multiply/add),
 * 2 stack variables, and 4 memory accesses
 */

/*
 * Generator Id's : 
 * $Id: exprdag.ml,v 1.43 2003/03/16 23:43:46 stevenj Exp $
 * $Id: fft.ml,v 1.44 2003/03/16 23:43:46 stevenj Exp $
 * $Id: to_c.ml,v 1.26 2003/03/16 23:43:46 stevenj Exp $
 */

void fftw_real2hc_2(const fftw_real *input, fftw_real *real_output,
		    fftw_real *imag_output, int istride, int real_ostride,
		    int imag_ostride)
{
     fftw_real tmp1;
     fftw_real tmp2;
     ASSERT_ALIGNED_DOUBLE;
     tmp1 = input[0];
     tmp2 = input[istride];
     real_output[real_ostride] = tmp1 - tmp2;
     real_output[0] = tmp1 + tmp2;
}

fftw_codelet_desc fftw_real2hc_2_desc = {
     "fftw_real2hc_2",
     (void (*)()) fftw_real2hc_2,
     2,
     FFTW_FORWARD,
     FFTW_REAL2HC,
     46,
     0,
     (const int *) 0,
};
