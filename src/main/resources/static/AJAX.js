                $("#enviar").click(validaEnvio);

                    function validaCampoVazio(campo){
                        if(campo.trim() == ''){
                            return true;
                        }else{
                            return false;
                        }
                    }

                    function validaEnvio(){
                        let podeEnviar = true;
                        let quantosNumeros = $("#quantosNumeros").val();
                        let numeroMaximo = $("#numeroMaximo").val();
                        let numeroMinimo = $("#numeroMinimo").val();

                        if(validaCampoVazio(quantosNumeros)){
                            podeEnviar = false;
                        }
                        if(validaCampoVazio(numeroMaximo)){
                            podeEnviar = false;
                        }
                        if(validaCampoVazio(numeroMinimo)){
                            podeEnviar = false;
                        }

                        if(podeEnviar){
                           $.ajax({
                                type: "POST",
                                url: "/",
                                data:{
                                    quantosNumeros:quantosNumeros,
                                    numeroMinimo:numeroMinimo,
                                    numeroMaximo:numeroMaximo,
                                },
                                success: function(data){
                                    $('html').html(data);
                                     $("#enviar").click(validaEnvio);
                                },
                                error: function (){
                                },
                           });
                        }
                    }
