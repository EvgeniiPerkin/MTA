package com.perkin.dev.domain;

import javax.persistence.*;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "t_executor")
public class Executor {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "executor_id")
	private Long executorId;
	@Column(name = "executor_name")
	@Length(max = 150, message = "The executor name is too long (more than 150)")
	private String executorName;
	public Long getExecutorId() {
		return executorId;
	}
	public void setExecutorId(Long executorId) {
		this.executorId = executorId;
	}
	public String getExecutorName() {
		return executorName;
	}
	public void setExecutorName(String executorName) {
		this.executorName = executorName;
	}
	
}
