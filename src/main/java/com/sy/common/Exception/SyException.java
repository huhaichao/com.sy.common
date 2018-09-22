package com.sy.common.Exception;

/**
 * 异常处理类
 * @author huchao
 *
 */
public class SyException extends Exception {

	   private static final long serialVersionUID = 1L;
       
	    /**
	     * 
	     */
		public SyException() {
	        super();
	    }
        
		/**
		 * 
		 * @param message
		 */
	    public SyException(String message) {
	        super(message);
	    }

	    /**
	     * 
	     * @param message
	     * @param cause
	     */
	    public SyException(String message, Throwable cause) {
	        super(message, cause);
	    }

	    /**
	    * 
	    * @param cause
	    */
	    public SyException(Throwable cause) {
	        super(cause);
	    }

	    /**
	     * 
	     * @param message
	     * @param cause
	     * @param enableSuppression
	     * @param writableStackTrace
	     */
	    protected SyException(String message, Throwable cause,
	                        boolean enableSuppression,
	                        boolean writableStackTrace) {
	        super(message, cause, enableSuppression, writableStackTrace);
	    }

}
