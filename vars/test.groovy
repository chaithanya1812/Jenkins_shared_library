def name(){
if(env.name){
echo "name is ${env.name}"
}else{

println("name is not declared")
}
}
