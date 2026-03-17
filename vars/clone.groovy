def call(String giturl, String gitbranch){
  echo "This will clone the code"
  git url: "${giturl}", branch: "${gitbranch}"
  echo "code cloned successfully"
}
