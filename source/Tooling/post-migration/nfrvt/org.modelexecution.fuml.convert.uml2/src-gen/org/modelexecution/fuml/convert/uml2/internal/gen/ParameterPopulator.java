/*
* Copyright (c) 2012 Vienna University of Technology.
* All rights reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License v1.0 which accompanies 
* this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
* Philip Langer - initial API and generator
*/
package org.modelexecution.fuml.convert.uml2.internal.gen;
    	
import javax.annotation.Generated;
import org.modelexecution.fuml.convert.impl.ConversionResultImpl;
import org.modelexecution.fuml.convert.uml2.internal.IElementPopulator;

@Generated(value="Generated by org.modelexecution.fuml.convert.uml2.gen.ElementPopulatorGenerator.xtend")
public class ParameterPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.eclipse.uml2.uml.Element uml2Element, ConversionResultImpl result) {
			
		if (!(uml2Element instanceof org.eclipse.uml2.uml.Parameter) ||
			!(fumlElement instanceof fUML.Syntax.Classes.Kernel.Parameter)) {
			return;
		}
		
		fUML.Syntax.Classes.Kernel.Parameter fumlNamedElement = (fUML.Syntax.Classes.Kernel.Parameter) fumlElement;
		org.eclipse.uml2.uml.Parameter uml2NamedElement = (org.eclipse.uml2.uml.Parameter) uml2Element;
		
		fumlNamedElement.direction = castParameterDirectionKind(uml2NamedElement.getDirection());
		
		
		
		fUML.Syntax.Classes.Kernel.MultiplicityElement multiplicityElement = new fUML.Syntax.Classes.Kernel.MultiplicityElement();
		multiplicityElement.upperValue = (fUML.Syntax.Classes.Kernel.ValueSpecification)result.getFUMLElement(uml2NamedElement.getUpperValue());
		multiplicityElement.lowerValue = (fUML.Syntax.Classes.Kernel.ValueSpecification)result.getFUMLElement(uml2NamedElement.getLowerValue());
		multiplicityElement.lower = uml2NamedElement.getLower();
		UMLPrimitiveTypes.UnlimitedNatural upper = new UMLPrimitiveTypes.UnlimitedNatural();
		upper.naturalValue = uml2NamedElement.getUpper();
		multiplicityElement.upper = upper;
		fumlNamedElement.multiplicityElement = multiplicityElement;
		
	}
	
	private fUML.Syntax.Classes.Kernel.ParameterDirectionKind castParameterDirectionKind(org.eclipse.uml2.uml.ParameterDirectionKind enumVal) {
		switch (enumVal.getValue()) {
			case org.eclipse.uml2.uml.ParameterDirectionKind.IN:
				return fUML.Syntax.Classes.Kernel.ParameterDirectionKind.in;
			case org.eclipse.uml2.uml.ParameterDirectionKind.INOUT:
				return fUML.Syntax.Classes.Kernel.ParameterDirectionKind.inout;
			case org.eclipse.uml2.uml.ParameterDirectionKind.OUT:
				return fUML.Syntax.Classes.Kernel.ParameterDirectionKind.out;
			case org.eclipse.uml2.uml.ParameterDirectionKind.RETURN:
				return fUML.Syntax.Classes.Kernel.ParameterDirectionKind.return_;
		}
		return null;
	}
}
