package ressources;


import Business.EtudiantBusiness;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("etudiants")
public class EtudiantRessources {

    private static final EtudiantBusiness etudiantBusiness=new EtudiantBusiness();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudentsByStageId(@QueryParam(value="stageId") int id){

        if(etudiantBusiness.getStudentsByStageId(id)!=null){
            return Response.status(Response.Status.FOUND).entity(etudiantBusiness.getStudentsByStageId(id)).build();
        }else return Response.status(Response.Status.NOT_FOUND).entity("Liste d'étudiants vide !!").build();
    }
}
