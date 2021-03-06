package org.datasays.wes.vo;

import java.util.List;

public class WSearchResultHits<T> {
	private Integer total = null;
	private Double max_score = null;
	private List<WEsDoc<T>> hits = null;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Double getMax_score() {
		return max_score;
	}

	public void setMax_score(Double max_score) {
		this.max_score = max_score;
	}

	public List<WEsDoc<T>> getHits() {
		return hits;
	}

	public void setHits(List<WEsDoc<T>> hits) {
		this.hits = hits;
	}
}
