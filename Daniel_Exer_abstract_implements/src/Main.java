interface Autenticavel {
    boolean autenticar();
}

abstract class Usuario {
    protected String login;

    public void exibirLogin() {
        System.out.println("Login: " + this.login);
    }
}

class Cliente extends Usuario implements Autenticavel {
    @Override
    public boolean autenticar() {
        return true;
    }
}

class Administrador extends Usuario implements Autenticavel {
    @Override
    public boolean autenticar() {
        return true;
    }
}
