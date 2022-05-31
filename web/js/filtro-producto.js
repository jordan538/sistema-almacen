$(document).ready(function () {  
   //cuando se escriba caracteres en la caja de texto  
    $(document).on('keyup','#txtnom',function(){  
        let valor = $(this).val();  
        listado(valor);  
    }); 

    function listado(consulta) {  
        opc = "1";  
        $.get("control", {opc, consulta}, (response) => {  
            const misDatos = JSON.parse(response);//recuperar la informacion q envio el controlador  
            //let template = "";  
            let template = "";  
            console.log(misDatos);  
             template += `  
             <table class="table table-fixed producto">  
                <thead class="">  
                    <tr>  
                        <th class="col-xs-3">Codigo</th>  
                        <th class="col-xs-3">Nombre</th>  
                        <th class="col-xs-6">Apellido</th>   
                    </tr>  
                </thead>  
            <tbody>`;    
            misDatos.forEach(midato => {  
                template += `  
                <tr>  
                    <td class="col-xs-3">${midato.coda}</td>  
                    <td class="col-xs-3">${midato.noma}</td>  
                    <td class="col-xs-6">${midato.ape}</td> 
                </tr>`;                      
            })  
            template += `</tbody></table>`;  
            $("#tablares").html(template); 
            }) 
        }
}) 


