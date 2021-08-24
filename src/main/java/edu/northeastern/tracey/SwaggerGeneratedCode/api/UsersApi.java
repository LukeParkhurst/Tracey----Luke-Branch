/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package edu.northeastern.tracey.SwaggerGeneratedCode.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

import java.util.Optional;
@Api(value = "users", description = "the users API")
public interface UsersApi {

    Logger log = LoggerFactory.getLogger(UsersApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }


    @ApiOperation(value = "Delete a specific activity by its Id", nickname = "deleteActivityByIdAndByDay", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ActivityByIdAndDayId - Delete specific users activity on specific day - success"),
        @ApiResponse(code = 400, message = "ActivityByIdAndDayId - Delete specific users activity on specific day - failed") })
    @RequestMapping(value = "/users/{userId}/days/{dayId}/activites/{activityId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteActivityByIdAndByDay(@ApiParam(value = "String ID of the user to get",required=true) @PathVariable("userId") String userId,@ApiParam(value = "String ID of the day to get",required=true) @PathVariable("dayId") String dayId,@ApiParam(value = "String ID of the activity to get",required=true) @PathVariable("activityId") String activityId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Delete a specific activtiy. Find by searching for User, Month and Activity Id.", nickname = "deleteActivityByIdAndUserAndMonthId", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ActivityByIdAndDayId - Delete specific activity on specific month - success"),
        @ApiResponse(code = 400, message = "ActivityByIdAndDayId - Delete specific activity on specific month - failed") })
    @RequestMapping(value = "/users/{userId}/months/{monthId}/activites/{activityId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteActivityByIdAndUserAndMonthId(@ApiParam(value = "String ID of the user to get",required=true) @PathVariable("userId") String userId,@ApiParam(value = "String ID of the month to get",required=true) @PathVariable("monthId") String monthId,@ApiParam(value = "String ID of the activity to get",required=true) @PathVariable("activityId") String activityId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Delete a specific user by its Id", nickname = "deleteUserById", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "UsersById - Delete users record - success"),
        @ApiResponse(code = 400, message = "UsersById - Delete users record - failed") })
    @RequestMapping(value = "/users/{userId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteUserById(@ApiParam(value = "String ID of the user to delete",required=true) @PathVariable("userId") String userId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get all activites for a specific user on a given day searching by user and day Id.", nickname = "getActivitiesByUserAndDay", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ActivitiesByUserAndDay - Get activities on specific day - success"),
        @ApiResponse(code = 400, message = "ActivitiesByUserAndDay - Get activities on specific day - failed") })
    @RequestMapping(value = "/users/{userId}/days/{dayId}/activities",
        method = RequestMethod.GET)
    default ResponseEntity<Void> getActivitiesByUserAndDay(@ApiParam(value = "String ID of the user to get",required=true) @PathVariable("userId") String userId,@ApiParam(value = "String ID of the day to get",required=true) @PathVariable("dayId") String dayId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Gets all activites for a specific user on a given month by searching its user and month Id.", nickname = "getActivitiesByUserAndMonth", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ActivitiesByUserAndMonth - Get activities on specific month - success"),
        @ApiResponse(code = 400, message = "ActivitiesByUserAndMonth - Get activities on specific month - failed") })
    @RequestMapping(value = "/users/{userId}/months/{monthId}/activities",
        method = RequestMethod.GET)
    default ResponseEntity<Void> getActivitiesByUserAndMonth(@ApiParam(value = "String ID of the user to get",required=true) @PathVariable("userId") String userId,@ApiParam(value = "String ID of the month to get",required=true) @PathVariable("monthId") String monthId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get a specific activity. Find by User, Day and Activity Id.", nickname = "getActivityByIdAndUserAndDayId", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ActivityByIdAndUserAndDayId - Get specific users activity on specific day - success"),
        @ApiResponse(code = 400, message = "ActivityByIdAndUserAndDayId - Get specific users activity on specific day - failed") })
    @RequestMapping(value = "/users/{userId}/days/{dayId}/activites/{activityId}",
        method = RequestMethod.GET)
    default ResponseEntity<Void> getActivityByIdAndUserAndDayId(@ApiParam(value = "String ID of the user to get",required=true) @PathVariable("userId") String userId,@ApiParam(value = "String ID of the day to get",required=true) @PathVariable("dayId") String dayId,@ApiParam(value = "String ID of the activity to get",required=true) @PathVariable("activityId") String activityId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get a specific activtiy. Find by searching for User, Month and Activity Id.", nickname = "getActivityByIdAndUserAndMonthId", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ActivityByIdAndMonthAndDay - Get specific users activity on specific month - success"),
        @ApiResponse(code = 400, message = "ActivityByIdAndDayId - Get specific users activity on specific month - failed") })
    @RequestMapping(value = "/users/{userId}/months/{monthId}/activites/{activityId}",
        method = RequestMethod.GET)
    default ResponseEntity<Void> getActivityByIdAndUserAndMonthId(@ApiParam(value = "String ID of the user to get",required=true) @PathVariable("userId") String userId,@ApiParam(value = "String ID of the month to get",required=true) @PathVariable("monthId") String monthId,@ApiParam(value = "String ID of the activity to get",required=true) @PathVariable("activityId") String activityId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Gets a specific user by its Id", nickname = "getUserById", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "UsersById - Get users record - success"),
        @ApiResponse(code = 400, message = "UsersById - Get users record - failed") })
    @RequestMapping(value = "/users/{userId}",
        method = RequestMethod.GET)
    default ResponseEntity<Void> getUserById(@ApiParam(value = "String ID of the user to get",required=true) @PathVariable("userId") String userId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get all user records", nickname = "getUsersRecord", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Users - Get users record - success"),
        @ApiResponse(code = 400, message = "Users - Get users record - failed") })
    @RequestMapping(value = "/users",
        method = RequestMethod.GET)
    default ResponseEntity<Void> getUsersRecord() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Modify/Patch a specific activity. Find by User, Day and Activity Id.", nickname = "patchActivityByIdAndUserAndDayId", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ActivityByIdAndUserAndDayId - Patch specific users activity on specific day - success"),
        @ApiResponse(code = 400, message = "ActivityByIdAndUserAndDayId - Patch specific users activity on specific day - failed") })
    @RequestMapping(value = "/users/{userId}/days/{dayId}/activites/{activityId}",
        method = RequestMethod.PATCH)
    default ResponseEntity<Void> patchActivityByIdAndUserAndDayId(@ApiParam(value = "String ID of the user to get",required=true) @PathVariable("userId") String userId,@ApiParam(value = "String ID of the day to get",required=true) @PathVariable("dayId") String dayId,@ApiParam(value = "String ID of the activity to get",required=true) @PathVariable("activityId") String activityId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Modify/Patch a specific activtiy. Find by searching for User, Month and Activity Id.", nickname = "patchActivityByIdAndUserAndMonthId", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ActivityByIdAndDayId - Patch specific activity on specific month - success"),
        @ApiResponse(code = 400, message = "ActivityByIdAndDayId - Patch specific activity on specific month - failed") })
    @RequestMapping(value = "/users/{userId}/months/{monthId}/activites/{activityId}",
        method = RequestMethod.PATCH)
    default ResponseEntity<Void> patchActivityByIdAndUserAndMonthId(@ApiParam(value = "String ID of the user to get",required=true) @PathVariable("userId") String userId,@ApiParam(value = "String ID of the month to get",required=true) @PathVariable("monthId") String monthId,@ApiParam(value = "String ID of the activity to get",required=true) @PathVariable("activityId") String activityId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Modify/Patch a specific user by its Id", nickname = "patchUserById", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "UsersById - Patch users record - success"),
        @ApiResponse(code = 400, message = "UsersById - Patch users record - failed") })
    @RequestMapping(value = "/users/{userId}",
        method = RequestMethod.PATCH)
    default ResponseEntity<Void> patchUserById(@ApiParam(value = "String ID of the user to patch",required=true) @PathVariable("userId") String userId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Create and add an activity for a specific user on a given month by searching its user and month Id.", nickname = "postActivitiesByUserAndMonth", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ActivitiesByMonth - Post specific users activities on specific month - success"),
        @ApiResponse(code = 400, message = "ActivitiesByMonth - Post specific users activities on specific month - failed") })
    @RequestMapping(value = "/users/{userId}/months/{monthId}/activities",
        method = RequestMethod.POST)
    default ResponseEntity<Void> postActivitiesByUserAndMonth(@ApiParam(value = "String ID of the user to get",required=true) @PathVariable("userId") String userId,@ApiParam(value = "String ID of the month to get",required=true) @PathVariable("monthId") String monthId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Create and add an activity for an user on a given day.", nickname = "postActivitiyByUserAndDay", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ActivitiesByUserAndDay - Post activities on specific day - success"),
        @ApiResponse(code = 400, message = "ActivitiesByUserAndDay - Post activities on specific day - failed") })
    @RequestMapping(value = "/users/{userId}/days/{dayId}/activities",
        method = RequestMethod.POST)
    default ResponseEntity<Void> postActivitiyByUserAndDay(@ApiParam(value = "String ID of the user to get",required=true) @PathVariable("userId") String userId,@ApiParam(value = "String ID of the day to get",required=true) @PathVariable("dayId") String dayId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Create a user record", nickname = "postUsersRecord", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Users - Post users record - success"),
        @ApiResponse(code = 400, message = "Users - Post users record - failed") })
    @RequestMapping(value = "/users",
        method = RequestMethod.POST)
    default ResponseEntity<Void> postUsersRecord() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Modify/Put a specific activity. Find by User, Day and Activity Id.", nickname = "putActivityByIdAndUserAndDayId", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ActivityByIdAndUserAndDayId - Put specific users activity on specific day - success"),
        @ApiResponse(code = 400, message = "ActivityByIdAndUserAndDayId - Put specific users activity on specific day - failed") })
    @RequestMapping(value = "/users/{userId}/days/{dayId}/activites/{activityId}",
        method = RequestMethod.PUT)
    default ResponseEntity<Void> putActivityByIdAndUserAndDayId(@ApiParam(value = "String ID of the user to get",required=true) @PathVariable("userId") String userId,@ApiParam(value = "String ID of the day to get",required=true) @PathVariable("dayId") String dayId,@ApiParam(value = "String ID of the activity to get",required=true) @PathVariable("activityId") String activityId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Modify/Put a specific activtiy. Find by searching for User, Month and Activity Id.", nickname = "putActivityByIdAndUserAndMonthId", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ActivityByIdAndDayId - Put specific users activity on specific month - success"),
        @ApiResponse(code = 400, message = "ActivityByIdAndDayId - Put specific users activity on specific month - failed") })
    @RequestMapping(value = "/users/{userId}/months/{monthId}/activites/{activityId}",
        method = RequestMethod.PUT)
    default ResponseEntity<Void> putActivityByIdAndUserAndMonthId(@ApiParam(value = "String ID of the user to get",required=true) @PathVariable("userId") String userId,@ApiParam(value = "String ID of the month to get",required=true) @PathVariable("monthId") String monthId,@ApiParam(value = "String ID of the activity to get",required=true) @PathVariable("activityId") String activityId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Modify/Put a specific user by its Id", nickname = "putUserById", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "UsersById - Put users record - success"),
        @ApiResponse(code = 400, message = "UsersById - Put users record - failed") })
    @RequestMapping(value = "/users/{userId}",
        method = RequestMethod.PUT)
    default ResponseEntity<Void> putUserById(@ApiParam(value = "String ID of the user to put",required=true) @PathVariable("userId") String userId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
