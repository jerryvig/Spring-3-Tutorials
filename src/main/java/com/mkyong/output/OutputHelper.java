package com.mkyong.output;
 
import com.mkyong.output.IOutputGenerator;
 
public class OutputHelper {
    IOutputGenerator outputGenerator;
 
    public void generateOutput(){
	outputGenerator.generateOutput();
    }
 
    public void setOutputGenerator(IOutputGenerator outputGenerator){
	this.outputGenerator = outputGenerator;
    }
}
