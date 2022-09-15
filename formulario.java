<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <title>replit</title>
  <link href="style.css" rel="stylesheet" type="text/css" />
</head>

<body>
  <script src="script.js"></script>
  <div class="container" >
    <a class="links" id="paracadastro"></a>
    
    <div class="content">      
      <!--FORMULÁRIO DE CADASTRO-->
      <div id="cadastro">
        <form method="post" action=""> 
          <h1>Cadastro de Produto</h1> 
          
          <p> 
            <label for="nome_cad">Nome</label>
            <input id="nome_cad" name="nome_cad" required="required" type="text" placeholder=" " />
          </p>
          
          <p> 
            <label for="preco_cad">Preço</label>
            <input id="preco_cad" name="preco_cad" required="required" type="value" placeholder=" "/> 
          </p>
          
          <p> 
            <label for="quant_cad">Quantidade</label>
            <input id="quant_cad" name="quant_cad" required="required" type="value" placeholder=" "/>
          </p>
          
          <p> 
            <input type="submit" value="Cadastrar"/> 
          </p>
          
          <p class="link">  
          </p>
        </form>
      </div>
    </div>
  </div> 

 <!--
  This script places a badge on your repl's full-browser view back to your repl's cover
  page. Try various colors for the theme: dark, light, red, orange, yellow, lime, green,
  teal, blue, blurple, magenta, pink!
  -->
  <script src="https://replit.com/public/js/replit-badge.js" theme="blue" defer></script> 
</body>

</html>
