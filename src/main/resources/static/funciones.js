function eliminar(id){
	swal({
	  title: "¡Estas seguro de eliminar?",
	  text: "¡Alto!, ¿Estás seguro de que quieres eliminar?",
	  icon: "warning",
	  buttons: true,
	  dangerMode: true,
	})
	.then((OK) => {
	  if (OK) {
		$.ajax({
			url: "/eliminar/"+id,
			success: function(){
				console.log(res);
			}
		})
	    swal("¡Poof! El registro ha sido eliminado", {
	      icon: "success",
	    }).then((ok)=>{
			if(ok){
				location.href="/listar";
			}
		});
	  } else {
	    swal("El registro no fue eliminado!");
	  }
	});
}