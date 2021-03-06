package com.vir.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Statistics {

	private Count wordCount;
	private Percent wordPercentage;

	@SuppressWarnings("unused")
	private Statistics() {
	}

	public Statistics(Count wordCount, Percent wordPercentage) {
		this.wordCount = wordCount;
		this.wordPercentage = wordPercentage;
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		Statistics that = (Statistics) obj;
		return EqualsBuilder.reflectionEquals(this, that);
	}

	public Count getWordCount() {
		return wordCount;
	}
	public void setWordCount(Count wordCount) {
		this.wordCount = wordCount;
	}
	public Percent getWordPercentage() {
		return wordPercentage;
	}
	public void setWordPercentage(Percent wordPercentage) {
		this.wordPercentage = wordPercentage;
	}
}
