/*
* generated by Xtext
*/
package de.itemis.tooling.xturtle.ui.labeling;

import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.label.DefaultDescriptionLabelProvider;

/**
 * Provides labels for a IEObjectDescriptions and IResourceDescriptions.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class XturtleDescriptionLabelProvider extends DefaultDescriptionLabelProvider {

/*
	//Labels and icons can be computed like this:
	
	String text(IEObjectDescription ele) {
	  return "my "+ele.getName();
	}
	 
    String image(IEObjectDescription ele) {
      return ele.getEClass().getName() + ".gif";
    }	 
*/
	public String text(IEObjectDescription ele) {
		StringBuilder b=new StringBuilder();
		b.append(ele.getQualifiedName().getLastSegment());
		b.append(" (");
		b.append(ele.getQualifiedName().toString(""));
		b.append("): ");
		b.append(ele.getEObjectURI().lastSegment());
		return b.toString();
		}
}
