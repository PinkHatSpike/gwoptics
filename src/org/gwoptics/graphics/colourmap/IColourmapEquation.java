/**
 *  Copyright notice
 *  
 *  This file is part of the Processing library `gwoptics' 
 *  http://www.gwoptics.org/processing/gwoptics_p5lib/
 *  
 *  Copyright (C) 2009 onwards Daniel Brown and Andreas Freise
 *  
 *  This library is free software; you can redistribute it and/or modify it under 
 *  the terms of the GNU Lesser General Public License version 2.1 as published 
 *  by the Free Software Foundation.
 *  
 *  This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 *  See the GNU Lesser General Public License for more details.
 *  
 *  You should have received a copy of the GNU Lesser General Public License along with 
 *  this library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, 
 *  Suite 330, Boston, MA 02111-1307 USA 
 */

package org.gwoptics.graphics.colourmap;

import org.gwoptics.graphics.GWColour;

/**
 * Simple interface which acts as a callback object for EquationColourmap
 * to generate a colourmap from a specific equation. Result should be 
 * return as a Colour object
 * 
 * @author Daniel Brown 18/6/09
 * @since 0.2.4
 * @see IColourmapEquation
 * @see EquationColourmap
 * @see GWColour
 */
public interface IColourmapEquation {
	public GWColour colourmapEquation(float loc);
}
