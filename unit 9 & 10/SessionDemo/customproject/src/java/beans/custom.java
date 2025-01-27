/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author lenovo
 */
public class custom extends TagSupport{
    String name;
    
    public String getName(){
    return name;
    }
    public void setName(String name){
    this.name=name;
    }
    
@Override
public int doStartTag() throws JspException {
    return SKIP_BODY;  // Skip body content since we're not using it
}

@Override
public int doEndTag() throws JspException {
    try {
        pageContext.getOut().write("Welcome " + name);  // Output the name
    } catch (IOException ex) {
        Logger.getLogger(custom.class.getName()).log(Level.SEVERE, null, ex);
    }
    return EVAL_PAGE;  // Continue processing the page after tag output
}

}