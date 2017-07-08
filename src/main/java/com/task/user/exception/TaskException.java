package com.task.user.exception;

/**
 * @author laxman
 *
 */
public class TaskException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TaskException(String errorMessage) {
		super(errorMessage);
	}
}
