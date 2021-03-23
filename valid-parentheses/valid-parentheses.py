class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        l = []
        for char in s:
            if char == ")":
                if len(l)==0 or l.pop() != "(":
                    return False
            elif char == "}":
                if len(l)==0 or l.pop() != "{":
                    return False
            elif char == "]":
                if len(l)==0 or l.pop() != "[":
                    return False
            else: # can add cases for ([{ if we want to include non brackets
                l.append(char)
        return not l
    

        