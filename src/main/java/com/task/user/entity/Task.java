package com.task.user.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @author laxman
 *
 */
@Data
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	private String title;

	private String description;

	@NotNull
	@OneToOne
	private Mentor createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Data createdOn;
}
