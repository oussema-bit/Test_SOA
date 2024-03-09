package ressources;

import Business.StageBusiness;
import Entities.Stage;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("stages")
public class StageRessources {
    private static final StageBusiness stageBusiness=new StageBusiness();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
        if(!StageBusiness.getAllStages().isEmpty())
            return Response.status(Response.Status.OK).entity(StageBusiness.getAllStages()).build();
        else return Response.status(Response.Status.NOT_FOUND).entity("Liste vide !!").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Stage stage){

        try{
            stageBusiness.addStage(stage);
        }catch (Exception e){
            return Response.status(Response.Status.NOT_FOUND).entity("Ajout échoué !!").build();
        }
        return Response.status(Response.Status.OK).entity("Ajout éffectué !!").build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam(value="id") int id){

        try{
            stageBusiness.deleteStage(id);
        }catch (Exception e){
            return Response.status(Response.Status.NOT_FOUND).entity("Suppression échouée !!").build();
        }
        return Response.status(Response.Status.OK).entity("Suppression aves success !!").build();

    }
}
