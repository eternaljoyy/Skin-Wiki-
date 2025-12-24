class Login {
    var username: String = ""

    fun main() {

    }

    // return the username
    fun getUsername() {
        return this.username;
    }

    // Change the username
    fun setUsername(String username) {
        this.username = username;
    }

    //Verufy against the DB whether the login creds are correct
    fun verifyLogin() {

    }

    //Connect to the database, if unable to connect, throw errors
    fun connectUserDatabase() {

    } 
}