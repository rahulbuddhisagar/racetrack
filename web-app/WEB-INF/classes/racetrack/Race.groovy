package racetrack

class Race {
	String name
	Date startDate
	String city
	String state
	BigDecimal distance
	BigDecimal cost
	Integer maxRunners=10000
	
 	static constraints = {
		name(blank:false, maxSize:50)
		startDate()
		city()
		state(inList:["GA","NC","SC","VA"])
		distance(min:0.0)
		cost(min:0.0, max:100.0)
		maxRunners(min:0, max:100000)
	}
}
