package com.ullink.slack.simpleslackapi.events;

import com.ullink.slack.simpleslackapi.SlackChannel;
import lombok.NonNull;

public class SlackMemberJoinedChannel implements SlackEvent{

    @NonNull
    private SlackChannel slackChannel;

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.SLACK_MEMBER_JOINED_CHANNEL;
    }

}
