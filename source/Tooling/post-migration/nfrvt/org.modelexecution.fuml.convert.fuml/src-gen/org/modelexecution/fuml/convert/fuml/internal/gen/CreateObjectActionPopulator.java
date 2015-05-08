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
public class CreateObjectActionPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.modelexecution.fuml.Syntax.Classes.Kernel.Element fumlElement_, 
		ConversionResultImpl result
		) {
			
		if (!(fumlElement_ instanceof org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateObjectAction) ||
			!(fumlElement instanceof fUML.Syntax.Actions.IntermediateActions.CreateObjectAction)) {
			return;
		}
		
		fUML.Syntax.Actions.IntermediateActions.CreateObjectAction fumlNamedElement = (fUML.Syntax.Actions.IntermediateActions.CreateObjectAction) fumlElement;
		
		org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateObjectAction fumlNamedElement_ = (org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateObjectAction) fumlElement_;
		
		fumlNamedElement.result = (fUML.Syntax.Actions.BasicActions.OutputPin) result.getFUMLElement(fumlNamedElement_.getResult());
		fumlNamedElement.classifier = (fUML.Syntax.Classes.Kernel.Classifier) result.getFUMLElement(fumlNamedElement_.getClassifier());
							
	}
	
}
