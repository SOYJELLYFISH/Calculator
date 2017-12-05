package cs1302.calc;

/* Implement the Math interface using iteration here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * REPLACE ME WITH ACTUAL JAVADOC FOR THIS CLASS.
 *
 * @author AUTHOR
 */
public class IterativeMath implements Math {

    public int inc(int n) {
        n = n + 1;
        return n;
    } // inc

    public int dec(int n) {
    	n = n -1;
    	if(n < 0)
    		return 0;
    	else
    		return n;
    } // dec

    public int add(int lhs, int rhs) {
        int sum = lhs;
        if(rhs > 0){
        while(rhs >0){
        	sum = inc(sum);
        	rhs = dec(rhs);
        }}
        else if (rhs < 0){
        	while(rhs < 0){
        	sum = dec(sum);
        	rhs = inc(rhs);
        	}
        }
        return sum;
    } // add

    public int sub(int lhs, int rhs) {
        int sum = lhs;
        if(rhs > 0){
        while(rhs > 0){
        	sum = dec(sum);
        	rhs = dec(rhs);
        }}
        else if( rhs < 0){
        	while(rhs < 0){
        		sum = inc(sum);
            	rhs = inc(rhs);
        	}
        }
      	
      	if (sum < 0){
      	return 0;
      	}
      	else
      		return sum;
       
    } // sub

    public int mul(int lhs, int rhs) {
    	int sum = lhs;
    	if(rhs <= 0) return 0;
	if(lhs < 0) return 0;
    	if(rhs > 0){
    	while(rhs > 1){
    		sum = add(sum, lhs);
    		rhs = dec(rhs);
    	}   	
    	
    	 		
    	}
    	return sum;
    		
    	}
       
     // mul

    public int div(int lhs, int rhs) {
    	if( rhs == 0 )
    	{
    		throw new ArithmeticException ("error");
    	}
	if(rhs < 0) return 0;
	if(lhs < 0) return 0;
    	int counter = 0; 
    	while(lhs >= rhs){
    		lhs = sub(lhs,rhs);
    		counter = inc(counter);    		
    	}
    	return counter;     	
    	} // div
    

    public int fac(int n) {
    	int fac = n;
    	if (n == 0) return 1;
    	if(n == 1) return 1;
    	while(n > 1){
    		n = dec(n);
    		fac = mul(fac,n);   
    		
    	}
    	return fac;
    } // fac

    public int pow(int lhs, int rhs) {
	if(rhs < 0) return 0;
	if(lhs < 0) return 0;
        int acc = 1;
        while(rhs >0){
        	acc = mul(acc,lhs);
        	rhs = dec(rhs);
        }
        	return acc;
        	
    } // pow

} // IterativeMath
