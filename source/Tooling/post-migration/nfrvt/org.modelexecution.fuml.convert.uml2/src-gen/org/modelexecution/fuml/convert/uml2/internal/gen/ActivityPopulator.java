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
public class ActivityPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.eclipse.uml2.uml.Element uml2Element, ConversionResultImpl result) {
			
		if (!(uml2Element instanceof org.eclipse.uml2.uml.Activity) ||
			!(fumlElement instanceof fUML.Syntax.Activities.IntermediateActivities.Activity)) {
			return;
		}
		
		fUML.Syntax.Activities.IntermediateActivities.Activity fumlNamedElement = (fUML.Syntax.Activities.IntermediateActivities.Activity) fumlElement;
		org.eclipse.uml2.uml.Activity uml2NamedElement = (org.eclipse.uml2.uml.Activity) uml2Element;
        
		
		for (org.eclipse.uml2.uml.ActivityNode value : uml2NamedElement.getNodes()) {
					fumlNamedElement.node.add((fUML.Syntax.Activities.IntermediateActivities.ActivityNode) result.getFUMLElement(value));
		}
		
		fumlNamedElement.isReadOnly = uml2NamedElement.isReadOnly();
		
		for (org.eclipse.uml2.uml.ActivityEdge value : uml2NamedElement.getEdges()) {
					fumlNamedElement.edge.add((fUML.Syntax.Activities.IntermediateActivities.ActivityEdge) result.getFUMLElement(value));
		}
		

		
		
		
	}
	
}