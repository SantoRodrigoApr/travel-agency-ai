package dev.ai;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/travel")
public class TravelAgentResource {

    @Inject
    PackageExpertWithTemplate assistant;

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String ask(String question, @HeaderParam("X-User-Name") String userName) {
        if (userName != null && !userName.isEmpty()) {
            try {
//                SecurityContext.setCurrentUser(userName);
                return assistant.chat(userName, question, userName); // Use userName as memoryId
            } finally {
//                SecurityContext.clear();
            }
        } else {
            return "User needs to be authenticated.";
        }
    }
}
