package cs1302.calc;
import java.lang.reflect.InvocationTargetException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
public class Controller {
	
	@FXML
	private boolean status = false;	
	@FXML
	private Text output;
	@FXML
	private Text output1 ;
	@FXML
	private String output2;
	@FXML
	private boolean status1 = false;	
	@FXML
	private Label bit1 = new Label();
	@FXML
	private Label bit2 = new Label();
	@FXML
	private Label bit3 = new Label();
	@FXML
	private Label bit4 = new Label();
	@FXML
	private Label bit5 = new Label();
	@FXML
	private Label bit6 = new Label();
	@FXML
	private Label bit7 = new Label();
	@FXML
	private Label bit8 = new Label();
	@FXML
	private Label bit9 = new Label();
	@FXML
	private Label bit10 = new Label();
	@FXML
	private Label bit11 = new Label();
	@FXML
	private Label bit12 = new Label();
	@FXML
	private Label bit13 = new Label();
	@FXML
	private Label bit14 = new Label();
	@FXML
	private Label bit15 = new Label();
	@FXML
	private Label bit16 = new Label();
	@FXML
	private Label bit17 = new Label();
	@FXML
	private Label bit18 = new Label();
	@FXML
	private Label bit19 = new Label();
	@FXML
	private Label bit20 = new Label();
	@FXML
	private Label bit21 = new Label();
	@FXML
	private Label bit22 = new Label();
	@FXML
	private Label bit23 = new Label();
	@FXML
	private Label bit24 = new Label();
	@FXML
	private Label bit25 = new Label();
	@FXML
	private Label bit26 = new Label();
	@FXML
	private Label bit27 = new Label();
	@FXML
	private Label bit28 = new Label();
	@FXML
	private Label bit29 = new Label();
	@FXML
	private Label bit30 = new Label();
	@FXML
	private Label bit31 = new Label();
	@FXML
	private Label bit32 = new Label();
	@FXML
	private boolean cleanText = false;
	/**
	 * takes ActionEvent
	 * when user press a button, the value of number button will appear on the text field.
	 * 
	 * @param ActionEvent
	 */	
	@FXML
	private void processNumpad(ActionEvent event){
		if(cleanText == true)
		{
		output.setText("");
		String value = ((Button)event.getSource()).getText();
		output.setText(output.getText()+value);	
		cleanText = false;
		}
		else
		{
			String value = ((Button)event.getSource()).getText();
			output.setText(output.getText()+value);		
		}
	}
	/**
	 * takes ActionEvent
	 * when user press a button, the value of operator button will appear on the text field.
	 * 
	 * @param ActionEvent
	 */
	@FXML
	private void operator(ActionEvent event){
		if(cleanText == true)
		{
		if(output1.getText().equals(null))
		{
			output.setText("0");
		}
		if(!output1.getText().equals("ERROR") &&!output1.getText().equals("0")){
		output.setText("");
		String ori = output1.getText();
		String value = ((Button)event.getSource()).getText();
		output.setText(ori + output.getText()+value);		
		cleanText = false;
		}
		else{
			output.setText("");
			String value = ((Button)event.getSource()).getText();
			output.setText(output.getText()+value);	
			cleanText = false;
		}
		}
		
		else
		{
			String value = ((Button)event.getSource()).getText();
			output.setText(output.getText()+value);	
		}
	}
	/**
	 * takes ActionEvent
	 * when user press "<", deletes any character before the current position
	 * 
	 * @param ActionEvent
	 */
	@FXML
	private void backSpace(ActionEvent event){
		String value = output.getText();
		if(value.length()-1>=0)
		{	
			if(value.charAt(value.length()-1) == '<' || value.charAt(value.length()-1) == '>' )
				{
				value = value.substring(0,value.length()-2);	
				}
				
			else{
				
				value = value.substring(0,value.length()-1);	
			}
		}
		if(value.length()-1 <0)
		value = null;		
		output.setText(value);	
	}
	/**
	 * takes ActionEvent
	 * when user press "X", deletes all the input on the text field.
	 * 
	 * @param ActionEvent
	 */
	@FXML
	private void clean(ActionEvent event){
		output.setText(null);	
		cleanText = false;
	}
	/**
	 * 
	 * when user press "=", computer the result from the text field.
	 * 
	 * @param ActionEvent
	 */
	@FXML
	private void equal(ActionEvent event) throws InvocationTargetException{
		String otpt = output.getText();
		String value = "";
		for(int i = 0; i < otpt.length(); i++)
	    {	
			if((otpt.charAt(i) =='0' || otpt.charAt(i) =='1'  || otpt.charAt(i) =='2' ||otpt.charAt(i) =='3' || otpt.charAt(i) =='4' || otpt.charAt(i) =='5' || otpt.charAt(i) =='6' || otpt.charAt(i) =='7' || otpt.charAt(i) =='8' || otpt.charAt(i) =='9'))
				value += otpt.substring(i,i+1);
			
			if(otpt.charAt(i) =='!' )
				value += " " + otpt.substring(i,i + 1);
			
			if(i-1 >= 0)
			{
			if(otpt.charAt(i) =='+' && (otpt.charAt(i-1) =='0' || otpt.charAt(i-1) =='1'  || otpt.charAt(i-1) =='2' ||otpt.charAt(i-1) =='3' || otpt.charAt(i-1) =='4' || otpt.charAt(i-1) =='5' || otpt.charAt(i-1) =='6' || otpt.charAt(i-1) =='7' || otpt.charAt(i-1) =='8' || otpt.charAt(i-1) =='9'||otpt.charAt(i-1) =='!'))
			{
				if(i>=0 || i <= otpt.length())
				{
					value += " "+ otpt.substring(i,i + 1) + " "; 				
				}				
			}
			else if((otpt.charAt(i) =='+' && !(otpt.charAt(i-1) =='0' || otpt.charAt(i-1) =='1'  || otpt.charAt(i-1) =='2' ||otpt.charAt(i-1) =='3' || otpt.charAt(i-1) =='4' || otpt.charAt(i-1) =='5' || otpt.charAt(i-1) =='6' || otpt.charAt(i-1) =='7' || otpt.charAt(i-1) =='8' || otpt.charAt(i-1) =='9'||otpt.charAt(i-1) =='!'))
)
			{
				value += otpt.substring(i,i + 1);
				
			}
			}
			if((otpt.charAt(i) =='*' || otpt.charAt(i) =='/'  || otpt.charAt(i) =='^' || otpt.charAt(i) =='-'))
			{
				if(i>=0 || i <= otpt.length())
				{
					value +=otpt.substring(i,i) + " "; 
					value +=otpt.substring(i,i+1) + " "; 
				}			
			}
			
			if(otpt.charAt(i) =='<' && otpt.charAt(i+1) =='<'  || otpt.charAt(i) =='>' && otpt.charAt(i+1) =='>' )
			{	
				value += " " + otpt.substring(i,i+2) + " ";			
			}
			
	    }	
	    	if(otpt.length() == 0)
	    	{	
	    		output1.setText("0");
	    		output2="00000000000000000000000000000000";
	    		getLabel(output2);
	    	}
	    	else{
		try  
		  {  		   
		    if(status == true){		
				String infix[] = value.split(" ");
				String postfix[] = ReversePolishNotation.infixToPostfix(infix);
				Math recursiveMath = new RecursiveMath();
				int result = ReversePolishNotation.evaluate(recursiveMath, postfix);
				value = Integer.toString(result);
				output1.setText(value);	
				value = Integer.toBinaryString(Integer.parseInt(value));
				String b = "";
				if(value.length() < 32)
					{			
					int	a = 32 - value.length();
					for(int i = 0;i < a; i++)
					{
						b = b+"0";
					}
					value = b + value;					
					}
				getLabel(value);
				}//if
				else
				{	
					String infix[] = value.split(" ");
					String postfix[] = ReversePolishNotation.infixToPostfix(infix);
					Math iterativeMath = new IterativeMath();		
					int result = ReversePolishNotation.evaluate(iterativeMath, postfix);
					value = Integer.toString(result);
					output1.setText(value);	
					value = Integer.toBinaryString(Integer.parseInt(value));
					String b = "";
					if(value.length() < 32)
						{			
						int	a = 32 - value.length();
						for(int i = 0;i < a; i++)
						{
							b = b+"0";
						}
						value = b + value;					
						}
					getLabel(value);
				}//else
		  } //try
		  catch(MalformedPostfixException nfe)  
		  {  	      
			  output1.setText("ERROR");
		  } 
		catch(NumberFormatException nfe)  
		  {  	      
			  output1.setText("ERROR");
		  } 
		catch(ArithmeticException efn){
			output1.setText("ERROR");
		  }
		catch(StackOverflowError e){
			output1.setText("StackOverflowError");
        }
	    	}//else
	    	cleanText = true;
		
	}//equal
	/**
	 * takes ActionEvent
	 * switch between recursion method and iterative method.
	 * 
	 * @param ActionEvent
	 */
	@FXML
	private void change(ActionEvent event){
		String value = ((Button)event.getSource()).getText();
		if( value.equals("Use Recursion")){
			status = true;
			((Button)event.getSource()).setText("Use Iterative");
		}
		else if (value.equals("Use Iterative")){
			status = false;
			((Button)event.getSource()).setText("Use Recursion");
		}		
	}
	/**
	 * takes ActionEvent
	 * user can hide the binary text  or show the binary text .
	 * 
	 * @param ActionEvent
	 */
	@FXML
	private void hide(ActionEvent event){
		String value = ((Button)event.getSource()).getText();
		if(value.equals("Hide Binary")){
			output2="                                ";
    		getLabel(output2);
			((Button)event.getSource()).setText("Show Binary");
		}
		else if(value.equals("Show Binary"))
		{		
			String value1 = Integer.toBinaryString(Integer.parseInt(output1.getText()));
			String b = "";
			if(value1.length() < 32)
				{			
				int	a = 32 - value1.length();
				for(int i = 0;i < a; i++)
				{
					b = b+"0";
				}
				value1 = b + value1;					
				}
			getLabel(value1);
			((Button)event.getSource()).setText("Hide Binary");
		}
		
	}
	/**
	 * takes MouseEvent
	 * user can change result by change binary number.
	 * when the binary is 1, if user click the label, it should change to 0.
	 * when the binary is 0, if user click the label, it should change to 1.
	 * 
	 * @param MouseEvent
	 */
	@FXML
	private void toggling(MouseEvent ME){
			String value = ((Label)ME.getSource()).getText();
			if(value.equals("1"))
				((Label)ME.getSource()).setText("0");			
			else if (value.equals("0"))
				((Label)ME.getSource()).setText("1");
			setOutput();				
		}
	/**
	 * sign all the bits to one string.
	 * compute the binary to decimal.
	 * show the decimal on the result text field.
	 * @param ActionEvent
	 */
	@FXML
	private void setOutput(){
		output2 = bit1.getText() +  bit2.getText() + bit3.getText() + bit4.getText() + bit5.getText() + bit6.getText() + bit7.getText() + bit8.getText()
				+ bit9.getText() + bit10.getText() + bit11.getText() + bit12.getText() + bit13.getText() + bit14.getText() + bit15.getText() + bit16.getText()
				+ bit17.getText() + bit18.getText() + bit19.getText() + bit20.getText() + bit21.getText() + bit22.getText() + bit23.getText() + bit24.getText()
				 + bit25.getText() + bit26.getText() + bit27.getText() + bit28.getText() + bit29.getText() + bit30.getText() + bit31.getText() + bit32.getText();
		int decimal = 0;
		for(int i = 0; i < output2.length(); i++)
		{
			int number = Character.getNumericValue(output2.charAt(i));
			IterativeMath math = new IterativeMath();
			decimal += number * math.pow(2,i);
		}
		output2 = Integer.toString(decimal);
		output1.setText(output2);				
	}	
	/**
	 * after computing the binary, sign every binaries to their own label.
	 * 
	 * 
	 * @param String value
	 */
	@FXML
	private void getLabel(String output2){
		bit1.setText(output2.substring(31, 32));
		bit2.setText(output2.substring(30, 31));
		bit3.setText(output2.substring(29, 30));
		bit4.setText(output2.substring(28, 29));
		bit5.setText(output2.substring(27, 28));
		bit6.setText(output2.substring(26, 27));
		bit7.setText(output2.substring(25, 26));
		bit8.setText(output2.substring(24, 25));
		bit9.setText(output2.substring(23, 24));
		bit10.setText(output2.substring(22, 23));
		bit11.setText(output2.substring(21, 22));
		bit12.setText(output2.substring(20, 21));
		bit13.setText(output2.substring(19, 20));
		bit14.setText(output2.substring(18, 19));
		bit15.setText(output2.substring(17, 18));
		bit16.setText(output2.substring(16, 17));
		bit17.setText(output2.substring(15, 16));
		bit18.setText(output2.substring(14, 15));
		bit19.setText(output2.substring(13, 14));
		bit20.setText(output2.substring(12, 13));
		bit21.setText(output2.substring(11, 12));
		bit22.setText(output2.substring(10, 11));
		bit23.setText(output2.substring(9, 10));
		bit24.setText(output2.substring(8, 9));
		bit25.setText(output2.substring(7, 8));
		bit26.setText(output2.substring(6, 7));
		bit27.setText(output2.substring(5, 6));
		bit28.setText(output2.substring(4, 5));
		bit29.setText(output2.substring(3, 4));
		bit30.setText(output2.substring(2, 3));
		bit31.setText(output2.substring(1, 2));
		bit32.setText(output2.substring(0, 1));	  		
	}
	
	
}
