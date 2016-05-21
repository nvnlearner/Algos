/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Parameters {
	public int matchPercentage;
	public boolean storage;
	public boolean onDemand;
	public boolean tenancy;
	public boolean scability;
	public boolean secure;
	public String cloudType;

	public enum Clouds {
		AWS, VSPHERE, VCA, AZURE
	}

	public Parameters(String cloudType, int percent, boolean storage, boolean onDemand, boolean tenancy,
			boolean scability, boolean secure) {
		this.cloudType = cloudType;
		this.matchPercentage = percent;
		this.storage = storage;
		this.onDemand = onDemand;
		this.tenancy = tenancy;
		this.secure = secure;
		this.scability = scability;
	}
}

public class Recommendation {

	public enum Factors {
		security, storage, onDemand, tenancy, scabality
	}

	private String[] clouds = { "AWS", "VSPHERE", "VCA", "AZURE" };
	private static String[] factors = { "security", "storage", "onDemand", "tenancy", "scability" };
	// cloud and data mapping //factor and value mapping
	private static Map<String, Parameters> dataStore; // HashMap<String, String>
	private static Map<String, List<String>> weightageCloudMap;
	private static Map<Recommendation.Factors, String> vSphereMap;
	private static Map<Recommendation.Factors, String> vcaMap;
	private static Map<Recommendation.Factors, String> azureMap;
	private static Map<String, Integer> weight;
	private static List<String> infra;
	static {
		// contain the factor values
		weightageCloudMap = new HashMap<String, List<String>>();
		for (int i = 0; i < factors.length; i++) {
			weightageCloudMap.put(factors[i], new ArrayList<String>());
		}
		vSphereMap = new HashMap<Recommendation.Factors, String>();
		vcaMap = new HashMap<Recommendation.Factors, String>();
		azureMap = new HashMap<Recommendation.Factors, String>();
		dataStore = new HashMap<String, Parameters>();
		infra = new ArrayList<String>();
	}
	
	class Entity {
		String name;
		String percent;
	}

	// cloudType , object
	private static void getRecommendations( Map<String, Parameters> result, int percent, String[] clouds, String[] factors, int currentFactor, Parameters input){
		if(clouds == null)
			return;  
		
		String key = factors[currentFactor];
		List<String> results = weightageCloudMap.get(key);
		
		if(!results.isEmpty()){
			for(String cloud : results){
				if(result.containsKey(cloud)){
					Parameters p = result.get(cloud);
					p.matchPercentage+=weight.get(key);
					if(p.matchPercentage == 100)
						result.put(key, p);
				}
				else{
					Parameters p = new Parameters();
				}
			}
		} else{
			
		}
		
		if(parameters.)
		getRecommendations(result, percent,clouds, factors, currentFactor+1);
		if(result.containsKey(key)){
			Parameters p = result.get(key);
			p.matchPercentage+=weight.get(key);
			if(p.matchPercentage == 100)
				infra.add();
			result.put(key, p);
		} 
		else{
			
		}
		
		
		//getRecommendations(result,);
	}

	// data dumping
	private static void init(Parameters param) {
		dataStore.put(param.cloudType, param);
		if (param.storage)
			weightageCloudMap.get(param.storage).add(param.cloudType);
		if (param.onDemand)
			weightageCloudMap.get(param.onDemand).add(param.cloudType);
		if (param.scability)
			weightageCloudMap.get(param.scability).add(param.cloudType);
		if (param.tenancy)
			weightageCloudMap.get(param.tenancy).add(param.cloudType);
		if(param.secure)
			weightageCloudMap.get(param.secure).add(param.cloudType);
	}

	public static void main(String[] args) {

	}

}
*/