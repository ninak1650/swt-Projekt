package kickstart.catalog;

import javax.persistence.*;

@Entity
public class Team {
	private @Id @GeneratedValue long id;

	@Transient
	private Status status = Status.OPEN;
	private String name;
	private int score;

	public Team(String name){

		this.name = name;
	}

	public Team(){}

	public int getScore(){
		return score;
	}

	public void setScore(int score){
		this.score = score;
	}

	public void setStatus(Status status){
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public String getName(){
		return name;
	}

	/*
	public void setName(String name) {
		this.name = name;
	}

	 */

	@Override
	public String toString() {
		return name;
	}
}
