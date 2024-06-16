package com.cricketteam;

import java.util.ArrayList;
import java.util.List;

class Player {
	private String name;
	private int jerseyNo;
	private int runs;

	public Player(int jerseyNo, String name, int runs) {
		this.jerseyNo = jerseyNo;
		this.name = name;
		this.runs = runs;
	}

	public int getJerseyNumber() {
		return jerseyNo;
	}

	public String getName() {
		return name;
	}

	public int getRuns() {
		return runs;
	}

	@Override
	public String toString() {
		return "Player{" + "jerseyNo=" + jerseyNo + ", name='" + name + '\'' + ", runs=" + runs + '}';
	}
}
