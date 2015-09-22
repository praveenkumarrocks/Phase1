package com.project1.base.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.domain.Persistable;

public abstract class BasePersistable<PK extends Serializable> implements Persistable<PK> {

	private static final long serialVersionUID = 8451871865237644085L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private PK id;

	public PK getId() {

		return id;
	}

	protected void setId(final PK id) {

		this.id = id;
	}

	public boolean isNew() {

		return null == getId();
	}

	@Override
	public String toString() {

		return String.format("Entity of type %s with id: %s", this.getClass().getName(), getId());
	}

	public boolean equals(Object obj) {

		if (null == obj) {
			return false;
		}

		if (this == obj) {
			return true;
		}

		if (!getClass().equals(obj.getClass())) {
			return false;
		}

		BasePersistable<?> that = (BasePersistable<?>) obj;

		return null == this.getId() ? false : this.getId().equals(that.getId());
	}


	public int hashCode() {

		int hashCode = 17;

		hashCode += null == getId() ? 0 : getId().hashCode() * 31;

		return hashCode;
	}
}
