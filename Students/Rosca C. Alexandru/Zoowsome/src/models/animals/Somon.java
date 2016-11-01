package models.animals;

public class Somon extends Aquatic{

	private int migrationDist;
	
	public Somon (){
		nrOfLegs = 0;
		name = "Somon";
		avgSwimDepth = 2;
	}
	
	public Somon(int migrationDist, int avgSwimDepth ){
		this();
		this.setMigrationDist(migrationDist);
		this.avgSwimDepth = avgSwimDepth;
	}

	public int getMigrationDist() {
		return migrationDist;
	}

	public void setMigrationDist(int migrationDist) {
		this.migrationDist = migrationDist;
	}
	
}
