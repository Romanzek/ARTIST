/*
* Copyright (c) 2013 Vienna University of Technology.
* All rights reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License v1.0 which accompanies 
* this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
* Philip Langer - initial API and generator
* Tanja Mayerhofer - generator
*/
package org.modelexecution.fuml.convert.fuml.internal.gen;
    	
import javax.annotation.Generated;

import org.modelexecution.fuml.convert.fuml.internal.IElementPopulator;
import org.modelexecution.fuml.convert.impl.ConversionResultImpl;

@Generated(value="Generated by org.modelexecution.fuml.convert.fuml.gen.ElementPopulatorGenerator.xtend")
public class OperationPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.modelexecution.fuml.Syntax.Classes.Kernel.Element fumlElement_, 
		ConversionResultImpl result
		) {
			
		if (!(fumlElement_ instanceof org.modelexecution.fuml.Syntax.Classes.Kernel.Operation) ||
			!(fumlElement instanceof fUML.Syntax.Classes.Kernel.Operation)) {
			return;
		}
		
		fUML.Syntax.Classes.Kernel.Operation fumlNamedElement = (fUML.Syntax.Classes.Kernel.Operation) fumlElement;
		
		org.modelexecution.fuml.Syntax.Classes.Kernel.Operation fumlNamedElement_ = (org.modelexecution.fuml.Syntax.Classes.Kernel.Operation) fumlElement_;
		
		fumlNamedElement.upper = new UMLPrimitiveTypes.UnlimitedNatural();
		fumlNamedElement.isQuery = fumlNamedElement_.isQuery();
		fumlNamedElement.isOrdered = fumlNamedElement_.isOrdered();
		fumlNamedElement.isUnique = fumlNamedElement_.isUnique();
		fumlNamedElement.lower = fumlNamedElement_.getLower();
		fumlNamedElement.upper.naturalValue = fumlNamedElement_.getUpper();
		fumlNamedElement.class_ = (fUML.Syntax.Classes.Kernel.Class_) result.getFUMLElement(fumlNamedElement_.getClass_());
		
		for (org.modelexecution.fuml.Syntax.Classes.Kernel.Operation value : fumlNamedElement_.getRedefinedOperation()) {
					fumlNamedElement.redefinedOperation.add((fUML.Syntax.Classes.Kernel.Operation) result.getFUMLElement(value));
		}
		
		fumlNamedElement.type = (fUML.Syntax.Classes.Kernel.Type) result.getFUMLElement(fumlNamedElement_.getType());
							
	}
	
}
