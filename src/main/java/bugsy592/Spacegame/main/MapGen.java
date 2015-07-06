package bugsy592.Spacegame.main;

public class MapGen {
	
	//Map
	int mapMaxX, mapMaxY;
	int mapSize = 0;
	int[][] map;
	
	//Planet Size
	int planetSizeMin, planetSizeMax;
	int planetAmountMin, planetAmountMax;
	int planetActAmount;
	
	
	public void createMap(){
		mapMaxX = mapSizeSetup();
		mapMaxY = mapMaxX;
		planetSetup();
		planetActAmount = (((int)Math.random()*planetAmountMax)+planetAmountMin);
		
	}
	
	public void planetSetup(){
		int baseMin = 20;
		int baseMax = 60;
		int baseAmount = 15;
		switch(mapSize){
		case 1:
			planetSizeMin = baseMin;
			planetSizeMax = baseMax;
			planetAmountMin = 1;
			planetAmountMax = baseAmount;
			break;
		case 2:
			planetSizeMin = baseMin;
			planetSizeMax = baseMax*4;
			planetAmountMin = baseAmount;
			planetAmountMax = baseAmount*4;
			break;
		case 3:
			planetSizeMin = baseMin*4;
			planetSizeMax = baseMax*8;
			planetAmountMin = baseAmount*4;
			planetAmountMax = baseAmount*8;
			break;
		}
	}
	
	public int mapSizeSetup(){
		int max = 0;
		switch(mapSize){
		case 0:
			//Random map size
			int map = (((int)Math.random()*3)+1);
			max = 4^(map + 4);
			setMapSize(map);
			break;
		case 1:
			//Small map size
			max = 4^(mapSize + 4);
			break;
		case 2:
			//Medium map size
			max = 4^(mapSize + 4);
			break;
		case 3:
			//Large map size
			max = 4^(mapSize + 4);
			break;
		}
		return max;
	}
	
	public int getMapSize(){
		return mapSize;
	}
	
	public void setMapSize(int size){
		mapSize = size;
	}
}
