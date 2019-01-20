package com.ullink.slack.simpleslackapi.events;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackTeam;
import com.ullink.slack.simpleslackapi.SlackUser;
import lombok.Data;
import lombok.NonNull;

@Data
public class SlackMemberJoinedChannel implements SlackEvent{

    @NonNull
    private SlackChannel slackChannel;

    @NonNull
    private SlackUser slackUserJoining;

    @NonNull
    private SlackUser slackUserInviter;

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.SLACK_MEMBER_JOINED_CHANNEL;
    }

}
