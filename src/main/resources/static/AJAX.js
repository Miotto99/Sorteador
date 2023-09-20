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
                        let repetir = $("#repetir")[0].checked;
                        let ordem = $("#ordem")[0].checked;

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
                                    repetir:repetir,
                                    ordem:ordem,
                                },
                                success: function(data){
                                    $("#balls").text("");
                                  
                                  for(let i = 0; i < data.length; i++){
                                    $("#balls").append('<div class="ball" id="result">'+data[i]+'</div>');
                                  }
                                  
                                  $("#data").html('<h1 style="padding: 10px; border-radius: 5px; display: flex;">'+new Date().toLocaleDateString()+' '+new Date().toLocaleTimeString()+'</h1>')

                                  $("#quantidade").html('<h1 style=" display: flex; padding: 10px;">Quantidade sorteada: ' + quantosNumeros + '</h1>')

                                  $("#entre").html('<h1 style=" display: flex; padding: 10px;">Número(s) entre : ' + numeroMinimo + ' e ' + numeroMaximo + '</h1>')
                                },
                                error: function (){
                                },
                           });
                        }
                    }
