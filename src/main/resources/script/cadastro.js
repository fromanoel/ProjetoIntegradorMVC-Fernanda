window.addEventListener('load', function () {
    alert("Página carregada com sucesso!");
    var btnCadastrar = document.getElementById('btnCadastrar');

    var regexUsuario = /^[a-zA-Z0-9]{5,20}$/;
    var regexCPF = /^[0-9]{3}\.[0-9]{3}\.[0-9]{3}-[0-9]{2}$/;
    var regexEmail = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
    var regexTelefone = /^\(\d{2}\)\d{5}-\d{4}$/;
    var regexSenha = /^[a-zA-Z0-9]{5,20}$/;

    var txtUsuario = document.getElementById('nome_usuario');
    var txtCPF = document.getElementById('cpf_usuario');
    var txtEmail = document.getElementById("email");
    var txtTelefone = document.getElementById("telefone");
    var txtSenha = document.getElementById("senha");

    btnCadastrar.addEventListener('click', function () {
        if (regexUsuario.test(txtUsuario.value)) {
            if (regexCPF.test(txtCPF.value)) {
                if (regexEmail.test(txtEmail.value)) {
                    if (regexTelefone.test(txtTelefone.value)) {
                        if (regexSenha.test(txtSenha.value)) {
                            alert("Cadastro realizado com sucesso!");
                        } else {
                            alert("Senha inválida!");
                        }
                    } else {
                        alert("Telefone inválido!");
                    }
                } else {
                    alert("Email inválido!");
                }
            } else {
                alert("CPF inválido!");
            }
        } else {
            alert("Usuário inválido!");
        }
    });
});