//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   var graph = createGraph()
    println("graph"+graph)

}


fun createGraph():Map<Int,List<Int>>{
 var graph = mutableMapOf<Int,List<Int>>()
    graph.put(1,listOf(2,3))
    graph.put(2,listOf(1,4,5))
    graph.put(3,listOf(1,6))
    graph.put(4,listOf(2))
    graph.put(5,listOf(2))
    graph.put(6,listOf(3))
   return graph
}